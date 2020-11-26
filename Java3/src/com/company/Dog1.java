package com.company;

    public class Dog1 extends Dog {
        private String ears;


        public String getEars() {
            return ears;
        }

        public void setEars(String ears) {
            this.ears = ears;
        }

        public Dog1(String race,int age,String ears) {
            setEars(ears);
            setRace(race);
            setAge(age);

        }
        public void printall() {
            System.out.println("Dog1: " + "race: " + getRace() + " age " + getAge() + " Ears is " + getEars());
        }

    }
