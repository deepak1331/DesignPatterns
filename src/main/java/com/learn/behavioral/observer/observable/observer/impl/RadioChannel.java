package com.learn.behavioral.observer.observable.observer.impl;

import com.learn.behavioral.observer.observable.observer.Channel;

public class RadioChannel implements Channel {

    private String news;

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    @Override
    public void update(Object o) {
        this.setNews((String) o);
        System.out.println("Got news Update : " + getNews());
    }
}
