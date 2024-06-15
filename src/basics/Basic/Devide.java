package basics.Basic;

import java.util.Scanner;

public class Devide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter dividend");
        int dividend =sc.nextInt();
        System.out.println("enter divisor");
        int divisor=sc.nextInt();
        int q;
        int r;
        q=dividend/divisor;
        r=dividend%divisor;
        System.out.println("quartient ="+q);
        System.out.println("reminder="+r);

    }
}
