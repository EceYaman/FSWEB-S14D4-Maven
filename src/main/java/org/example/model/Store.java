package org.example.model;

import org.example.rpg.Monster;
import org.example.rpg.Troll;

public class Store {
    public static void main(String[] args) {

        ProductForSale[] products = new ProductForSale[3];

        products[0] = new Chocolate("Chocolate", 5.0, "Sweet chocolate");
        products[1] = new Coke("Coke", 2.5, "Refreshing drink");
        products[2] = new Bread("Bread", 1.5, "Fresh bread");

        Store store = new Store();
        store.listProducts(products);

        Monster troll = new Troll("Troll", 100, 50.0);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
        }
    }
}