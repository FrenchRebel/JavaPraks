package com.company;

import java.util.Scanner;

class Main {
    public static void main(String args[]) { //Factorial

        int fact = 1;
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i=1; i<=num;i++)
        {
            fact = fact*i;
        }
        System.out.print(fact);
        in.close();


    }

}


