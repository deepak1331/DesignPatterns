package com.learn.structural.adapter;

import com.learn.structural.adapter.itemAdapter.GroceryItemAdapter;
import com.learn.structural.adapter.product.impl.FoodItem;
import com.learn.structural.adapter.product.impl.GroceryProduct;

/***
 * Here we are considering example of a Food Delivery service, which now decides to deliver grocery as well.
 * So it's a suitable case to implement Adapter Design Pattern, where groceryItems need to be compatible with foodItems.
 */
public class AdapterMain {
    public static void main(String[] args) {
        SwiggyStore swiggyStore = new SwiggyStore();

        swiggyStore.addItems(new FoodItem("Burger", 100.0, "Swanky Kitchen"));
        swiggyStore.addItems(new FoodItem("Paneer Pizza", 180.0, "Domino's"));
        swiggyStore.addItems(new GroceryItemAdapter(new GroceryProduct("Bread", 40.0, "Krishna General Store")));

        swiggyStore.showAllItems();
    }
}