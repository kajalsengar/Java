package LoopQuestions;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("enter any number");
        int number = user.nextInt();

        for (int i=1; i<=10 ;i++){
            int table= i*number;
            System.out.println( table);
        }
    }
}
