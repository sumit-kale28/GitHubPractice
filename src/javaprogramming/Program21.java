package javaprogramming;

import java.util.Scanner;

public class Program21 {
    public static void main(String[] args) {
        int [][] array=new int[3][3];
        int sum=0;
        int smallest, largest;
        int even=0;
        int odd=0;
        System.out.println("Enter Elements of 3D Array: ");
        Scanner sc=new Scanner(System.in);
        for(int row=0;row< array.length;row++)
        {
          for(int col=0;col< array.length;col++)
          {
              array[row][col]=sc.nextInt();
          }
        }
        smallest=array[0][0];
        largest=array[0][0];
        System.out.println("--------Display Array--------");
        for(int i=0; i < array.length;i++)
        {
            for(int j=0;j< array.length;j++)
            {
                System.out.print("\t"+array[i][j]);
            }
            System.out.println();
        }

        System.out.println("---------Sum of array--------");
        for(int num1=0; num1 < array.length;num1++)
        {
            for(int num2=0;num2< array.length;num2++)
            {
                sum =sum+array[num1][num2];
                if(smallest>array[num1][num2])
                {
                    smallest=array[num1][num2];
                }
                if(largest<array[num1][num2])
                {
                    largest=array[num1][num2];
                }
                if(array[num1][num2]%2==0)
                {
                    even=even+1;
                }
                else
                {
                    odd=odd+1;
                }

            }
        }
        System.out.println("Sum of all element of array: "+ sum);
        System.out.println("---------Find Smallest Element of Array--------");
        System.out.println("Smallest Element of array: "+smallest);
        System.out.println("---------Find Largest Element of Array--------");
        System.out.println("Largest Element of array: "+largest);
        System.out.println("---------Find No of Even & Odd Element of Array--------");
        System.out.println("No of Even Element of array:"+even);
        System.out.println("No of odd Element of array:"+odd);
    }
}
