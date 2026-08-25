package javaprogramming;

import java.util.Scanner;

public class Program14 {
    static void main(String[] args) {
        //Take two numbers and print the greater number
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter First Number:");
        int num1=Sc.nextInt();
        System.out.println("Enter Second Number:");
        int num2=Sc.nextInt();
        if(num1>num2)
        {
            System.out.println("Number 1 is Greater"+num1);
        }
        else if(num2>num1)
        {
            System.out.println("Number 2 is Greater"+num2);
        }
        else {
             System.out.println("Both Numbers are Equal");
        }
    }
}
