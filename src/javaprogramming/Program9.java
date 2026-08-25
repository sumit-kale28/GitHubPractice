package javaprogramming;

public class Program9 {
    static void main(String[] args) {
        System.out.println("Even No Series using for loop");
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }

        System.out.println("Odd No Series using While loop");
        int j=1;
        while(j<=50)
        {
            if(j%2!=0)
            {
                System.out.println(j);

            }
            j++;
        }
    }
}
