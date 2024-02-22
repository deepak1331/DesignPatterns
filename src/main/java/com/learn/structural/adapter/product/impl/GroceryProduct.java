package com.learn.structural.adapter.product.impl;

import com.learn.structural.adapter.product.GroceryItem;

public class GroceryProduct implements GroceryItem {


    private String name;
    private Double price;
    private String storeName;

    public GroceryProduct(String name, Double price, String storeName) {
        this.name = name;
        this.price = price;
        this.storeName = storeName;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public String toString() {
        return "GroceryProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", storeName='" + storeName + '\'' +
                '}';
    }
}
