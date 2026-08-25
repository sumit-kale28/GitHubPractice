package javaprogramming;

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of 5 subjects");

        System.out.print("Enter 1st subject marks: ");
        int sub1 = sc.nextInt();
        if(sub1<0 || sub1>100){
            System.out.println("Invalid marks entered for 1st subject. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Enter 2nd subject marks: ");
        int sub2 = sc.nextInt();
        if(sub2<0 || sub2>100){
            System.out.println("Invalid marks entered for 2nd subject. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Enter 3rd subject marks: ");
        int sub3 = sc.nextInt();
        if(sub3<0 || sub3>100){
            System.out.println("Invalid marks entered for 3rd subject. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Enter 4th subject marks: ");
        int sub4 = sc.nextInt();
        if(sub4<0 || sub4>100){
            System.out.println("Invalid marks entered for 4th subject. Please enter marks between 0 and 100.");
            return;
        }

        System.out.print("Enter 5th subject marks: ");
        int sub5 = sc.nextInt();
        if(sub5<0 || sub5>100){
            System.out.println("Invalid marks entered for 5th subject. Please enter marks between 0 and 100.");
            return;
        }

        int total = sub1 + sub2 + sub3 + sub4 + sub5;

        float average = total / 5.0f;

        float percentage = (total / 500.0f) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("First Class with A+ Grade");
        }
        else if (percentage >= 80) {
            System.out.println("First Class with A Grade");
        }
        else if (percentage >= 70) {
            System.out.println("Second Class with B+ Grade");
        }
        else if (percentage >= 60) {
            System.out.println("Second Class with B Grade");
        }
        else if (percentage >= 50) {
            System.out.println("Third Class with C Grade");
        }
        else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
