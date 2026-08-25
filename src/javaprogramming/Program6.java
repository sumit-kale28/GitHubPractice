package javaprogramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Program6 {
    static void main(String[] args) {
        /*
        Write a program to convert Celsius into Fahrenheit.
        Formula:F = (C × 9/5) + 32
         */
        double f=0;
        double c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Celsius:");
        c=sc.nextDouble();
        f=(c*9/5)+32;
        System.out.println("Fahrenheit:"+f);
    }
}
