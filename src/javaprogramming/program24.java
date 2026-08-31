package javaprogramming;

public class program24 {
    static void main(String[] args) {
        program24 p=new program24();
        add();
        p.sub();
    }
    static void add()
    {
       int a=10;
       int b=20;
       int result=a+b;
        System.out.println("Result of Addition: "+result);
    }
    void sub()
    {
        int a=50;
        int b=20;
        int result=a-b;
        System.out.println("Result of subtraction: "+result);
    }
}
