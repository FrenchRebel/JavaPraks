
package com.company;
import java.util.Scanner;
public class harmony {
    public static void main(String args[]) {//Harmony

        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();
        double sum = 0;
        double num;
        int c = 1;
        for (int i = 1 ;i < 10;i++){
            num = 1.0/c;
            sum=sum+num;
            c++;
            System.out.println(num);
        }
        System.out.println(sum);

    }
}
