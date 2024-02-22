package com.learn.structural.adapter;

import com.learn.structural.adapter.product.Item;

import java.util.ArrayList;
import java.util.List;

/***
 * It can be Swiggy/Zomato/Blikit/DeliveryStore etc
 */
public class SwiggyStore {

    private List<Item> items = new ArrayList<>();

    public void addItems(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        if (items.size() > 0)
            items.stream().forEach(System.out::println);
    }
}
