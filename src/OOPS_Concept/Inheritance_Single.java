package OOPS_Concept;

public class Inheritance_Single {
    public static void main(String[] args) {
        childSingle cs= new childSingle();//Access Parents & Child Data Members.
        parentSingle ps = new parentSingle(); //Access only parents data members
        // childSingle CH= new parentSingle(); Not Possible Child Refer Parent Instance
        parentSingle PH=new childSingle(); //Access only parents data members.
        System.out.println(cs.name);
        System.out.println(cs.age);
        cs.display();
        cs.displaychild();

    }
}

    class parentSingle {
        String name = "Parent sumit";

        public void display() {
            System.out.println("Parent Class Data Member: " + name);
        }
    }

    class childSingle extends parentSingle{
    int age=18;
    public void displaychild()
    {
        System.out.println("Child Age: "+age);
        System.out.println("Parent Name in Child: "+name);
    }
    }

