package javaprogramming;

import java.util.Scanner;

public class program12 {
    static void main(String[] args) {
        System.out.println("Write a program to calculate the sum of digits.");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        System.out.println("Sum of digits:"+sum);
    }
}
