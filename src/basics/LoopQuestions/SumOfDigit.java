package basics.LoopQuestions;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any  number..");
        int number = input.nextInt();
        int remender=0;
        int sum=0;

        while (number!=0){
            remender = number%10;
            sum=sum+remender;
            number=number/10;
        }
        System.out.println("sum of all digit="+sum);
    }
}
