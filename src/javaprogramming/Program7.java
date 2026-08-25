package javaprogramming;

import java.util.Scanner;

public class Program7 {
    static void main(String[] args) {
        int a = 23;
        int b = 4;

        System.out.println(a % b); //%-mod symbol returns Reminder

        //Write a program to check whether a number is even or odd using
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to check even or odd:");
        int check= sc.nextInt();
        if(check%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
