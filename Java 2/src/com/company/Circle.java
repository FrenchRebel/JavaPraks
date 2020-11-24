package com.company;

public class Circle {
    private int rad;

    public void setRad(int rad) {
        this.rad = rad;
    }
    public int getRad() {
        return rad;
    }
    public float getLength() {
        return (float) (2 * Math.PI * rad);
    }
    public float getSquare() {
        return (float) (Math.PI * rad * rad);
    }
}