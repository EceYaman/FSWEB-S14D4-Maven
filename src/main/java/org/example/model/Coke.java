package org.example.model;

public class Coke extends ProductForSale{
    private boolean isDiet;

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

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public double getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void showDetails() {
        System.out.println("Coke Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }

}
