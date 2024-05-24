package LoopQuestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number...");
        int number= input.nextInt();
        int a=0;
        int b=1;
        int temp;
        int i=1;

        while(i<=number) {
            System.out.println(a);
            temp = a + b;
            a = b;
            b = temp;
            i++;
        }
    }
}
