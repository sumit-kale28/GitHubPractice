package javaprogramming;

public class Program11 {
    static void main(String[] args) {
        System.out.println("Find the sum of all even numbers between 1 and 100.");
        int sum=0;
        for(int i=0;i<=100;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }

        }
        System.out.println(sum);
    }
}
