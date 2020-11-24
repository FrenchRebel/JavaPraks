package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        System.out.println("Age: ");
        int age = in.nextInt();
        System.out.println("Height: ");
        int height = in.nextInt();
        System.out.println("Gender(Male/Female): ");
        String gender = in.next();
        Human human = new Human();
        human.setAge(age);
        human.setHeight(height);
        human.setGender(gender);


        System.out.println("Enter lenght of arm: ");
        int lenght = in.nextInt();
        System.out.println("Enter count of fingers: ");
        int CoF = in.nextInt();
        Human.Hand hand = new Human.Hand();
        hand.setCoF(CoF);
        hand.setLenght(lenght);


        System.out.println("Enter color of eyes: ");
        String CoE = in.next();
        System.out.println("Enter color of hair: ");
        String CoH = in.next();
        Human.Head head = new Human.Head();
        head.setCoE(CoE);
        head.setCoH(CoH);

        System.out.println("Enter size of leg: ");
        int size = in.nextInt();
        Human.Leg leg = new Human.Leg();
        leg.setSize(size);
        leg.setSize(size);

        System.out.println("Color of hair on head is "+ head.getCoH() + " and " + "Color of eyes is " + head.getCoE());
        System.out.println("Count of fingers "+ hand.getCoF() + " and " + "lenght of arm " + hand.getLenght());
        System.out.println("Size of the leg is "+ leg.getSize() );
        System.out.println("Age "+ human.getAge() + " Height " + human.getHeight() + " Gender " + human.getGender());


        System.out.println("Enter a radius: ");
        int rad = in.nextInt();
        Circle circle = new Circle();
        circle.setRad(rad);
        System.out.println("Lenght is: " + circle.getLength());
        System.out.println("Square is: " + circle.getSquare());

        System.out.println("Email is: ");
        String email = in.next();
        System.out.println("Name is: ");
        String name = in.next();
        System.out.println("Gender is: ");
        String gender_author = in.next();
        char gender1 = gender_author.charAt(0);
        Author author = new Author(name,email,gender1);
        System.out.println(author.toString());


    }
}