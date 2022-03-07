package com.example.rssfeed.rssfeed.controller;

import com.example.rssfeed.rssfeed.feed.RssFeedView;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.View;


@RestController
@RequestMapping
public class RssFeedController {
    private final RssFeedView rssFeedView = new RssFeedView();

    @GetMapping("/rss")
    public View getFeed(){
        return rssFeedView;
    }
}
