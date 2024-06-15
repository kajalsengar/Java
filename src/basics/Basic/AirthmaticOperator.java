package basics.Basic;

import java.util.Scanner;

public class AirthmaticOperator {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter first number ");
            int num1 = input.nextInt();
            System.out.println("enter second number");
            int num2 = input.nextInt();
            System.out.println("enter operator");
            char operator=input.next().charAt(0);

            switch (operator) {
                case '+' : System.out.println("addition=" + num1+num2);
                    break;
                case '-' : System.out.println(
                        num1-num2);
                    break;
                case '*' : System.out.println("multiplication=" + num1*num2);
                    break;
                case '/' : System.out.println("division=" + num1/num2);
                    break;
                case '%' : System.out.println("modulus=" + num1%num2);
                    break;
                default: System.out.println("wrong operator");
            }
        }
    }

