package LoopQuestions;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int number =scanner.nextInt();

        for (int i=1; i<=number; i++){
            if (number%i==0){
                System.out.println(i);
            }
        }
    }
}
