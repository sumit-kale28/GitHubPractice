package javaprogramming;

import java.util.Scanner;

public class program13 {
    static void main(String[] args) {
        //Positive Number
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num=Sc.nextInt();
        if(num%5==0)
        {
            System.out.println("Number Diviisible by 5");
        }
        else {
             System.out.println("Not Divisible by 5");        }
    }
}
