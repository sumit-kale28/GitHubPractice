package javaprogramming;

import java.util.Scanner;

public class program17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first Number: ");
        double num1=sc.nextDouble();
        System.out.println("Enter second Number: ");
        double num2=sc.nextDouble();
        System.out.println("Enter an operator (+, -, *, /,%): ");
        char opt=sc.next().charAt(0);
        double result=0;
        switch (opt)
        {
            case '+':
                result=num1+num2;
                System.out.println("Sum of two number is: "+result);
                break;
            case '-':
                result=num1-num2;
                System.out.println("difference of two number is: "+result);
                break;
            case '*':
                result=num1*num2;
                System.out.println("Multiplication of two number is: "+result);
                break;
            case '/':
                if(num2!=0 && num1!=0) {
                    result = num1 / num2;
                    System.out.println("Division of two number is: " + result);
                }
                else {
                    System.out.println("Enter Valid number");
                }
                break;
            case '%':
                if(num2!=0 && num1!=0) {
                    result = num1 % num2;
                    System.out.println("reminder of Division of two number is: " + result);
                }
                else {
                    System.out.println("Enter Valid number");
                }
                break;
            default:
                System.out.println("invalid operator, Select valid operator");
                break;


        }

    }
}
