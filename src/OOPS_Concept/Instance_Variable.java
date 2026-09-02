package OOPS_Concept;

public class Instance_Variable {
    int globalage=23;

    public static void staticmethod()
    {
        Instance_Variable IV=new Instance_Variable();
        System.out.println("Static Method-Non Static Variable/Create Instance of class and access variable: "+IV.globalage);
    }
    public void non_staticmethod()
    {
        System.out.println("Non Static Method, (Non static variable-Non Static method=direct access): "+globalage);
    }

    public static void main(String[] args) {
        Instance_Variable ObjIV=new Instance_Variable();
        ObjIV.non_staticmethod();
        staticmethod();
    }
}
