package javaprogramming;

import java.util.Scanner;

public class Program27 {

    public static void main(String[] args) {
        System.out.println("Enter Number to print star Pattern:");
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        Star(i);
    }
    public static void Star(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
