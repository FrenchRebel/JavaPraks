package com.company;

public class Human {
    private int age;
    private int height;
    private String gender;

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public static class Hand{
        private int lenght;
        private int CoF;

        public int getCoF() {
            return CoF;
        }

        public int getLenght() {
            return lenght;
        }

        public void setCoF(int coF) {
            CoF = coF;
        }

        public void setLenght(int lenght) {
            this.lenght = lenght;
        }
    }

    public static class Head{
        private String CoH;
        private String CoE;

        public String getCoE() {
            return CoE;
        }

        public String getCoH() {
            return CoH;
        }

        public void setCoE(String coE) {
            CoE = coE;
        }

        public void setCoH(String coH) {
            CoH = coH;
        }
    }

    public static class Leg{

        private int size;

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }
    }
}
