package javaprogramming;

import java.util.Scanner;

public class program22 {

    //Local variable
    public static void main(String[] args) {
        System.out.println("hello user welcome...Please enter following details ");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Age: ");
        int age= sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("Enter your salary:");
        double salary=sc.nextDouble();
        System.out.println("----------Your Entered Information----------");
        System.out.println("Name: "+ name);
        System.out.println("age: "+age);
        System.out.println("Salary: "+ salary);
        sc.close();
        int x=10;
        if(true)
        {
            int y=20;
            //int x=12;--not possible
            System.out.println("Value of X inside Local body: "+x);
            System.out.println("Y: "+y);
        }
        System.out.println("Value of X:"+x);
        //System.out.println("Value of Y:"+y);--Error due to its a local variable so can't access outside Scope
    }
}
