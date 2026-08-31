package javaprogramming;

import javax.naming.Name;

public class Program23 {
    //Instance / Non-Static Variables
    public static void main(String[] args) {
        Student s1=new Student();

        s1.Name="Sumit";
        s1.salary=50000;
        s1.age=39;


        System.out.println(s1.Name);
        System.out.println(s1.age);
        System.out.println(s1.salary);
        System.out.println("-----Second Object-----");
        Student s2=new Student();
        s2.Name="S";
        s2.salary=5;
        s2.age=9;
        System.out.println(s2.Name);
        System.out.println(s2.age);
        System.out.println(s2.salary);
        System.out.println("-----Third Object-----");
        Student S3=new Student();
        System.out.println(S3.Name);
        System.out.println(S3.age);
        System.out.println(S3.salary);
    }
}
class Student
{
    String Name;
    int age;
    double salary;
}
