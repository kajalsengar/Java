package LoopQuestions;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any number of factorial..");
        int num = input.nextInt();
        int fact =1;

        for (int i=num ; i>=1 ; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
