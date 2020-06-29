package com.springboot.service;

import com.springboot.mapper.NewsMapper;
import com.springboot.model.News;
import com.springboot.model.NewsExample;
import com.springboot.model.TypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    NewsMapper newsMapper;

    @Override
    public List<News> queryAllNewsByType(String type) {
        NewsExample newsExample = new NewsExample();
        newsExample.createCriteria().andTypeIdEqualTo(type);
        List<News> newsList = newsMapper.selectByExample(newsExample);
        return newsList;
    }

    @Override
    public News queryNewsDetail(String newsId) {
        return newsMapper.selectByPrimaryKey(newsId);
    }
}
