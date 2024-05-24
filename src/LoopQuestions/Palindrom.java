package LoopQuestions;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number for checking...");
        int number = sc.nextInt();
        int temp=0;
        int result=0;
        int check=number;

        while (number!=0){
            temp=number%10;
            result=result*10+temp;
            number=number/10;
        }

        if (result==check){
            System.out.println("number is palindrom");
        }
        else{
            System.out.println("number is not palindrom");
        }
    }
}
