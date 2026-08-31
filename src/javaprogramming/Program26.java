package javaprogramming;

import java.util.Scanner;

public class Program26 {
    public static void main(String[] args) {
        System.out.println("Enter Price of Mobile: ");
        Scanner sc=new Scanner(System.in);
        int mob_price=sc.nextInt();
        String seg=mobSeg(mob_price);
        System.out.println("Mobile Segment: "+seg);
        sc.close();
    }

    public static String mobSeg(int Price)
    {
        String user_mob_seg=null;
        if(Price>=1000 && Price<=4999)
        {
            user_mob_seg="Low Segment";
        } else if (Price>=5000 && Price<=9999) {
         user_mob_seg="Mid Segment";
        } else if (Price>=10000 && Price<=19999) {
            user_mob_seg="High Segment";
        } else if (Price>=20000 && Price<=49000) {
         user_mob_seg="Premium Segment";
        } else if (Price>=50000 && Price<=200000) {
            user_mob_seg="Ultra Premium Segment";
        } else {
            user_mob_seg="Mobile Segment Not Define";
        }
        return user_mob_seg;
    }
}
