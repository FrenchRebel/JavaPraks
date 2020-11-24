package com.company;

import java.util.Scanner;

public class random {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array;
        array = new int[n];
        int buff = 0;
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 1000);

        for (int j = 0; j < i; j++) {

            if (array[j] > array[j + 1]) {
                buff = array[j];
                array[j] = array[j + 1];
                array[j + 1] = buff;
            }
        }
            System.out.println(array[i]);
        }

    }
}


