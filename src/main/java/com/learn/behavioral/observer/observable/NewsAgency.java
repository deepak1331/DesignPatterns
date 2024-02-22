package com.learn.behavioral.observer.observable;

import com.learn.behavioral.observer.observable.observer.Channel;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {

    private String news;

    private List<Channel> channelList = new ArrayList<>();

    public void addObserver(Channel channel) {
        channelList.add(channel);
    }

    public void removeObserver(Channel channel) {
        channelList.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        channelList.stream().forEach(c -> c.update(news));
    }
}
