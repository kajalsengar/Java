package LoopQuestions;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any  number");
        int number = sc.nextInt();
        int remender=0;
        int result =0;
        int check= number;

        while (number!=0){
            remender=number%10;
            result=result+remender*remender*remender;
            number=number/10;
        }
        //  System.out.println(result);
        if (check==result){
            System.out.println("number is armstrong");
        }
        else {
            System.out.println("number is not armstrong");
        }
    }

}
