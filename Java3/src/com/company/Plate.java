package com.company;

public class Plate extends Dish{
    private String art;


    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public Plate(String material,int diametr,String art) {
        setArt(art);
        setDiametr(diametr);
        setMaterial(material);
    }

    public void printall() {
        System.out.println("Plate: " + "material: " + getMaterial() + " diametr " + getDiametr() + " art on plate is " + getArt());
    }
}
