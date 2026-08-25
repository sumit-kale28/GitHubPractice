package javaprogramming;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {

        Scanner Sc=new Scanner(System.in);
        int choice;
        do {
            System.out.println("--------Calculator Menu--------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication");
            System.out.println("5.Exit");
            System.out.println("Enter your Choice between 1 to 5");
            choice = Sc.nextInt();
            if(choice>=1 && choice<=4)
            {
                System.out.println("Enter Number 1: ");
                double num1=Sc.nextDouble();
                System.out.println("Enter Number 2: ");
                double num2=Sc.nextDouble();
                double result=0;
                switch(choice)
                {
                    case 1:
                        result=num1+num2;
                        System.out.println("Sum of two Number is: "+result);
                        break;
                    case 2:
                        result=num1-num2;
                        System.out.println("Sub of two Number is: "+result);
                        break;
                    case 3:
                        if(num2!=0 & num1!=0) {
                            result = num1 / num2;
                            System.out.println("Division of two Number is: " + result);
                        }
                        else
                        {
                            System.out.println("Error: Division by zero is not allowed.");
                        }
                        break;
                    case 4:
                        result=num1*num2;
                        System.out.println("Multiplication of two Number is: "+result);
                        break;

                }

            }
            else if(choice==5)
            {
                System.out.println("Exiting the calculator...Good Bye");
                System.exit(0);
            }
            else
            {
                System.out.println("Please Enter Valid Input");
            }
        }while(choice!=5);
Sc.close();
    }
}
