package javaprogramming;

public class Program5 {
    static void main(String[] args) {
        //Swap Two Numbers using Temp Variable
        System.out.println("Swap Two Numbers using Temp Variable");
        int a=10;
        int b=20;
        System.out.println("Before Swapping a="+a+" b="+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swaping a="+a+" b="+b);

        //Swap Two Numbers without using Temp with sum/diff logic Variable
        System.out.println("Swap Two Numbers without using Temp with sum/diff logic Variable");
        int c=30;
        int d=40;
        System.out.println("Before Swapping c="+c+" d="+d);
        c=c+d;
        d=c-d;
        c=c-d;
        System.out.println("After Swapping c="+c+" d="+d);

        //Swap Two Numbers without using Temp Mul/Div Variable
        System.out.println("Swap Two Numbers without using Temp Mul/Div Variable");
        int e=30;
        int f=40;
        System.out.println("Before Swapping e="+e+" f="+f);
        e=e*f;
        f=e/f;
        e=e/f;
        System.out.println("After Swapping e="+e+" f="+f);
    }
}
