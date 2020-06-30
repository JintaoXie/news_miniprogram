// pages/detail/detail.js
const app = getApp()
Page({

  /**
   * 页面的初始数据
   */
  data: {
    newsDetail: {},
  },
  onLoad(params){
    var me = this;
    var newsId = params.newsId;
    wx.request({
      url: app.serverUrl + '/news/detail/' + newsId,
      header: {
        'content-type': 'application/json' // 默认值
      },
      success (res) {
        var mydata = res.data;
        var status = mydata.status;
        if(status === 200){
          var newsDetail = mydata.data;
          me.setData({
            newsDetail:newsDetail
          });
        }
      }
    })
  }
})