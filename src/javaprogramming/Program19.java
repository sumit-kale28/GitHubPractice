package javaprogramming;

public class Program19 {
    public static void main(String[] args) {
        int[] arr1= new int[3];
        arr1[0]=300;
        arr1[2]=500;
        System.out.println("Get Array data by Index");
        System.out.println(arr1[2]);


        System.out.println("Print Array length:");
        System.out.println(arr1.length);
        System.out.println("print Array using for Loop");
        for(int i=0; i< arr1.length;i++)
        {
            System.out.println(arr1[i]);
        }

        System.out.println("Second Integer Array");
        int [] arr={10,20,30,40,50};
        for(int j:arr)
        {
            System.out.println(j);
        }

        System.out.println("Character Array");
        char [] name={'S','U','M','I','T'};
        System.out.println(name.length);
        for(int k=0;k<name.length;k++)
        {
            System.out.print(name[k]);
        }

    }
}
