package org.example.model;

public class Chocolate extends ProductForSale{
    private String flavor;

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

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public double getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void showDetails() {
        System.out.println("Chocolate Type: " + getType() + ", Price: " + getPrice() + ", Description: " + getDescription());
    }

}
