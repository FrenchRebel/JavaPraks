package com.company;

public class Dog2 extends Dog {
    private String wool;


    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    public Dog2(String race,int age,String wool) {
        setWool(wool);
        setRace(race);
        setAge(age);

    }
    public void printall() {
        System.out.println("Dog1: " + "race: " + getRace() + " age " + getAge() + " Wool is " + getWool());
    }

}
