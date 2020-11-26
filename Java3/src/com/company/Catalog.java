package com.company;

import java.util.Scanner;

public class Catalog extends Furniture {
    public void Katalog() {
        Scanner in = new Scanner(System.in);
        Table table = new Table("wood ",15,3,400);
        Chair chair = new Chair("wood ",5," yes ",150);
        System.out.println("Catalog: ");
        int choice = 0;
        int priceall = 0;
                table.printall();
                chair.printall();

        System.out.println("Wanna buy something?: (1-Yes/any number - No)");
        int buychair = 0;
        int buytable = 0;
        int qchair = 0;
        int qtable = 0;

        int cont = in.nextInt();
        if(cont == 1) {
            while (cont == 1) {
                System.out.println("Chair = 1");
                System.out.println("Table = 2");
                choice = in.nextInt();
                if (choice == 1) {
                    System.out.println("Enter a quantity ");
                    qchair = in.nextInt();
                    buychair = buychair + qchair * chair.getPrice();
                    System.out.println("Continue = 1");
                    cont = in.nextInt();
                } else if (choice == 2) {
                    System.out.println("Enter a quantity ");
                    qtable = in.nextInt();
                    buytable = buytable + qtable * table.getPrice();
                    System.out.println("Continue = 1");
                    cont = in.nextInt();
                } else {
                    System.out.println("Your checklist is: ");
                    System.out.println(priceall = buychair + buytable);
                    System.out.println("Continue = 1/Exit = any number");
                    cont = in.nextInt();
                }
                if(cont !=1 ) {
                    System.out.println("Your checklist is: " + (priceall = buychair + buytable));
                }
            }
        }
        else  {
            System.exit(0);
        }


    }
}
