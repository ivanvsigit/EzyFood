package com.example.ezyfood;

public class Order {
    private String drink;
    private int qty;
    private int price;



    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return qty*price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public Order(String drink, int qty, int price){
        this.drink = drink;
        this.qty = qty;
        this.price = price;
    }

}
