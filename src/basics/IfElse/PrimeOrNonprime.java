package basics.IfElse;

import java.util.Scanner;

public class PrimeOrNonprime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int number = sc.nextInt();
        int flag=0;

        for (int i=2; i<number;i++){
            if (number%i==0){
                System.out.println("number is not prime");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println("number is prime");
        }
    }
}
