package javaprogramming;

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No do u want to search in array: ");
        int search=sc.nextInt();
        System.out.println("Sum of One dimension Array Element");
        int []Arr_sum={10,20,30,40,50};
        int sum=0;
        for(int i=0; i< Arr_sum.length; i++)
        {
            sum=sum+Arr_sum[i];
        }
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of Array: "+(sum/ Arr_sum.length));

        System.out.println("Find largest Number of Array");
        int largest=Arr_sum[0];
        int smallest=Arr_sum[0];
        for(int index=0;index<Arr_sum.length;index++)
        {
            if(Arr_sum[index]>largest)
            {
                largest=Arr_sum[index];
            }
            if(Arr_sum[index]<smallest)
            {
                 smallest=Arr_sum[index];
            }
        }
        System.out.println("Largest Element of Array: "+largest);
        System.out.println("Smallest Element of Array: "+smallest);
        for(int k: Arr_sum)
        {
            if(k==search)
            {
                System.out.println("Element Present in array");
                break;
            }
            else
            {
                System.out.println("Element Not Present in Array");
            }
        }

    }
}
