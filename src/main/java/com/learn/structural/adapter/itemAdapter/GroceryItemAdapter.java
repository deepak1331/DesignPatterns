package com.learn.structural.adapter.itemAdapter;

import com.learn.structural.adapter.product.GroceryItem;
import com.learn.structural.adapter.product.Item;

public class GroceryItemAdapter implements Item {
    private GroceryItem item;

    public GroceryItemAdapter(GroceryItem item) {
        this.item = item;
    }

    @Override
    public String getName() {
        return item.getName();
    }

    @Override
    public Double getPrice() {
        return item.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return item.getStoreName();
    }

    @Override
    public String toString() {
        return item.toString();
    }
}
