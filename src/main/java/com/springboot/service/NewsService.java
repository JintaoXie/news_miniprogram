package com.springboot.service;

import com.springboot.model.News;

import java.util.List;

public interface NewsService {
    public List<News> queryAllNewsByType(String type);

    public News queryNewsDetail(String newsId);
}
