package com.company;

public class Table extends Furniture {
        private int legs;


    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public Table(String material,int weight,int legs,int price) {
        setLegs(legs);
        setMaterial(material);
        setWeight(weight);
        setPrice(price);
    }
    public void printall() {
        System.out.println("Table: " + "material: " + getMaterial() + " weight " + getWeight() + " Quantity of legs " + getLegs() + " price is " + getPrice());
    }


}
