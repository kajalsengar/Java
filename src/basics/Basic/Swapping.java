package basics.Basic;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b =  sc.nextInt();
        System.out.println("a="+ a +"  b=" +b);

        // swapping without using 3rd variable
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("after swapping \na="+a  +"  b=" +b);

        // in one line
        b=a+b-(a=b);
        System.out.println("after again swapping \na="+a+"  b=" +b);
    }
}
