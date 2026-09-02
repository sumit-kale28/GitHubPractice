package OOPS_Concept;

public class Local_Variables {
    int a=10; //Global Variable, Non Static Variable, Instance Variable

    public void print()
    {
     int b=20; //Local Variable: Scope in block only
        System.out.println("I am in Block");
        System.out.println("Local Variable: " +b);
        System.out.println("Global variable: Declaration in class level can access Child block: "+a);
        for(int num=1;num<=2;num++)
        {
            System.out.println("Within a block: "+num);
        }
        // System.out.println(num);--error due to Num access is within a block only
    }
    public static void main(String[] args) {
        int maina=100;
        if(maina==100)
        {
            int no=1;
            System.out.println(no);
        }

        System.out.println("Main block variable: "+maina);
        System.out.println("I am in Main");
        Local_Variables obj=new Local_Variables();
        obj.print();
        System.out.println("Global Variable: "+obj.a);
    }
}
