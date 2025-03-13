package org.example.model;

public class Bread extends ProductForSale{
    private double weight;

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public double getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void showDetails() {
        System.out.println("Bread Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }

}
