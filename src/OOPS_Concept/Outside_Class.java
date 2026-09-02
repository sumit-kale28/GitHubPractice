package OOPS_Concept;

public class Outside_Class {
    static
    {
        System.out.println("Static Block0");
    }
    static
    {
        System.out.println("Static Block1");
    }
    static
    {
        System.out.println("Static Block2");
    }
    static void main(String[] args) {
        Instance_Variable Out=new Instance_Variable();
        System.out.println(Out.globalage);
        Out.non_staticmethod();
        Instance_Variable.staticmethod(); //Static Method within Static method of Out side class-Access using Class name.
    }
}
