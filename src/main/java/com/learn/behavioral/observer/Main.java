package com.learn.behavioral.observer;

import com.learn.behavioral.observer.observable.NewsAgency;
import com.learn.behavioral.observer.observable.observer.Channel;
import com.learn.behavioral.observer.observable.observer.impl.RadioChannel;
import com.learn.behavioral.observer.observable.observer.impl.TVNewsChannel;

public class Main {

    public static void main(String[] args) {
        Channel radioChannelObserver = new RadioChannel();
        Channel tvNewsChannelObserver = new TVNewsChannel();

        NewsAgency observable = new NewsAgency();
        observable.addObserver(tvNewsChannelObserver);
        observable.addObserver(radioChannelObserver);

        observable.setNews("India beat England in 3rd Test in Rajkot by 434 runs");
    }
}