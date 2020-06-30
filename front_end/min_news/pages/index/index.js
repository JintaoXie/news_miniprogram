//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    types: [],
    defaultNewsTypeId: 1001,
    defaultTypeIndex: 0
  },
  showDetail(e){
    // console.log(e);
    // debugger;
    var newsId = e.currentTarget.dataset.newsid;
    wx.navigateTo({
      url: '/pages/detail/detail?newsId=' + newsId,
    });
  },
  onLoad(){
    var me = this;
    wx.request({
      url: app.serverUrl + '/type/all',
      header: {
        'content-type': 'application/json' // 默认值
      },
      success (res) {
        var mydata = res.data;
        var status = mydata.status;
        if(status === 200){
          var typeArr = mydata.data;
          me.setData({
            types:typeArr
          });
        }
      }
    })
    me.fetchNewsList();
  },
  fetchNewsList(){
    var me = this;
    var defaultNewsTypeId = me.data.defaultNewsTypeId;
    wx.request({
      url: app.serverUrl + '/news/list?typeId=' + defaultNewsTypeId,
      header: {
        'content-type': 'application/json' // 默认值
      },
      success (res) {
        var mydata = res.data;
        var status = mydata.status;
        if(status === 200){
          var newsList = mydata.data;
          // console.log(newsList);
          var newsWrapperList = [];
          for(var i = 0; i < newsList.length; i++){
            var news = newsList[i];
            var coverImgStr = news.coverImg;
            var coverImgArr = [];
            if(coverImgStr != null && coverImgStr != undefined && coverImgStr != ""){
              coverImgArr = JSON.parse(coverImgStr);
            }

            var newsWrapper = {
              news: news,
              coverImgArr: coverImgArr
            }
            newsWrapperList.push(newsWrapper);
          }
          me.setData({
            newsWrapperList: newsWrapperList
          });
          console.log(newsWrapperList)
        }
      }
    }) 
  },
  switchNews(e){
    var choosenindex = e.currentTarget.dataset.choosenindex;
    var defaultTypeIndex = this.data.defaultTypeIndex;
    if(choosenindex == defaultTypeIndex){
      return;
    }
    this.setData({
      defaultTypeIndex:choosenindex
    });
    var typeid = e.currentTarget.dataset.typeid;
    this.setData({
      defaultNewsTypeId:typeid
    });
    this.fetchNewsList();
  }
})
