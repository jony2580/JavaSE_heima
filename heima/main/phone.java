package com.heima.main;

public class phone {
    private String brand;
    private int price;

    public phone(){
    }

    public phone(String brand,int price){
        this.brand=brand;
        this.price=price;
    }

    public String getBrand(){
        return brand;
    }
    public void setBrand(){
        this.brand=brand;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(){
        this.price=price;
    }
}
