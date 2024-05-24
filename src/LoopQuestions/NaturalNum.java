package LoopQuestions;

import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter a number");
        int n =input.nextInt();
        int sum= 0;

        for (int i=0 ; i<=n ; i++){
            sum=sum+i;
        }
        System.out.println("sum of natual number= "+sum);
    }
}
