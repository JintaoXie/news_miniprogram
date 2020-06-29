package com.springboot.controller;

import com.springboot.model.News;
import com.springboot.model.Type;
import com.springboot.service.NewsService;
import com.springboot.service.TypeService;
import com.springboot.utils.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping("/list")
    public JSONResult newsList(String typeId){
        List<News> newsList = newsService.queryAllNewsByType(typeId);
        return JSONResult.ok(newsList);
    }

    @GetMapping("/detail/{newsId}")
    public JSONResult detail(@PathVariable String newsId){
        News news = newsService.queryNewsDetail(newsId);
        return JSONResult.ok(news);
    }

}
