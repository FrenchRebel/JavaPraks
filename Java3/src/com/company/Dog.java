package com.company;

public abstract class Dog {
    protected String race;
    protected int age;

    public int getAge() {
        return age;
    }

    public String getRace() {
        return race;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
