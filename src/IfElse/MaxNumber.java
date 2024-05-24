package IfElse;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter number of a");
        int a = input.nextInt();
        System.out.println("enter number of b");
        int b =input.nextInt();
        System.out.println("enter number of c");
        int c =input.nextInt();
        System.out.println("a="+ a + "  b="+ b +  "  c=" +c);

        if ((a>b && a>c) || (b>c && b>a)){
            if (a>b){
                System.out.println("a is maximum number");
            }
            else {
                System.out.println("b is maximum number");
            }
        }
        else {
            System.out.println("c is maximum number");
        }
    }
}
