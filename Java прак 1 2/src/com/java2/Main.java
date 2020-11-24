package com.java2;

import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        Book book = new Book();
        System.out.println("enter an author: ");
        String author = in.nextLine();

        System.out.println("enter an name: ");
        String name = in.nextLine();

        System.out.println("enter a date ");
        int date = in.nextInt();

        book.setAuthor(author);
        book.setName(name);
        book.setDate(date);

        System.out.println(book.toString());

        System.out.println("enter a name: ");
        String name_dog = in.next();

        System.out.println("enter an age: ");
        int age = in.nextInt();



        Dog dog = new Dog(age, name_dog);
        System.out.println(dog.toString() + " Human age : " + dog.Humage());


    }
}
