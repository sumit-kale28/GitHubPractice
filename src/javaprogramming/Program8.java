package javaprogramming;

public class Program8 {
    static void main(String[] args) {
        //Print 1 to 10 numbers using for loop.
        System.out.println("Print 1 to 10 numbers using for loop.");
        for(int i=10;i>=1;i-=1)
        {
            System.out.println(i);
        }
        //Print 1 to 10 numbers using while loop.
        System.out.println("Print 1 to 10 numbers using while loop.");
        int j=10;
        while(j>=1)
        {
            System.out.println(j);
            j-=1;
        }

        System.out.println("Print 1 to 10 numbers using Do-While loop.");
        int k=10;
        do
        {
            System.out.println(k);
            k--;
        }while(k>=1);
    }
}
