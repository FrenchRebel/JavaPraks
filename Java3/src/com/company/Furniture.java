package com.company;

public abstract class Furniture {
        protected String material;
        protected int weight;
        protected int price;

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getMaterial() {
        return material;
    }

}
