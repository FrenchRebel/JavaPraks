package com.company;

public class Chair extends Furniture {
    private String back;


    public String getBack() {
        return back;
    }

    public void setBack(String back) {
        this.back = back;
    }

    public Chair(String material,int weight,String back,int price) {
        setBack(back);
        setMaterial(material);
        setWeight(weight);
        setPrice(price);

    }
    public void printall() {
        System.out.println("Chair: " + "material: " + getMaterial() + " weight " + getWeight() + " Back exist" + getBack() + " price is " + getPrice());
    }

}