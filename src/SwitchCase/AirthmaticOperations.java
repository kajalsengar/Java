package SwitchCase;

import java.util.Scanner;

public class AirthmaticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter value of number 1");
        int num1= input.nextInt();
        System.out.println("enter value of number 2");
        int num2= input.nextInt();
        System.out.println("enter an operator..");
        char operator = input.next().charAt(0);

        switch (operator){
            case '+':
                System.out.println("addition= "+ (num1+num2));break;
            case '-':
                System.out.println("substraction= "+ (num1-num2));break;
            case '*':
                System.out.println("multiplication= "+ (num1*num2));break;
            case '/':
                System.out.println("division= "+ (num1/num2));break;
            default:
                System.out.println("pls choose right operator....");
        }
    }

}
