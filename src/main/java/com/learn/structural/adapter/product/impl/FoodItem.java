package com.learn.structural.adapter.product.impl;

import com.learn.structural.adapter.product.Item;

public class FoodItem implements Item {

    private String foodName;
    private Double foodPrice;
    private String restaurantName;

    public FoodItem(String foodName, Double foodPrice, String restaurantName) {
        this.foodName = foodName;
        this.foodPrice = foodPrice;
        this.restaurantName = restaurantName;
    }

    @Override
    public String getName() {
        return foodName;
    }

    @Override
    public Double getPrice() {
        return foodPrice;
    }

    @Override
    public String getRestaurantName() {
        return restaurantName;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                ", restaurantName='" + restaurantName + '\'' +
                '}';
    }
}
