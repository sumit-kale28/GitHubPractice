package javaprogramming;

public class program25 {
   void add(int a, int b)
    {
        //Get value from parameter but no return
        int sum=a+b;
        System.out.println("Sum:"+ sum);
    }
    static void sub()
    {
        //No parameter No return
        int a=10;
        int b=5;
        int diff=a-b;
        System.out.println("Subtraction:"+ diff);
    }
    int mul(int x, int y)
    {
        return x*y;
    }

    static int div(int p, int q)
    {
    return p/q;
    }

    String name()
    {
        return "Sumit Kale";
    }
    public static void main(String[] args) {
       program25 p1=new program25();
       p1.add(56,44);
       sub();
       int Result_mul=p1.mul(10,20);
        System.out.println("Multiplication :"+Result_mul);
       int Result_div=div(55,5);
        System.out.println("Division: "+ Result_div);
        System.out.println("Name: "+p1.name());
    }
}
