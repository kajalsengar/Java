package LoopQuestions;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter any number");
        int number = input.nextInt();
        int temp=0;
        int reverse =0;

        while (number!=0){
            temp=number%10;
            reverse=reverse*10+temp;
            number=number/10;

        }
        System.out.println("reverse= "+reverse);
    }
}
