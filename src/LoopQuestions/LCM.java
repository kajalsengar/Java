package LoopQuestions;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number ");
        int first = input.nextInt();
        System.out.println("enter second number ");
        int second = input.nextInt();
        System.out.println(first+"  "+second);

        int hcf=1;
        if (second>first){
            int temp =first;
            first=second;
            second =temp;
        }
        for(int i=1 ; i<=second; i++ ){
            if (first%i==0 && second%i==0){
                hcf=i;
            }
        }

        int lcm =(first*second/hcf);

        System.out.println("lcm= "+lcm);
    }
}
