package IfElse;

import java.util.Scanner;

public class Charector {
    public static void main(String[] args) {
        Scanner alfa = new Scanner(System.in);
        System.out.println("enter any charector ");
        char c = alfa.next().charAt(0);

        if (c=='a'|| c=='e' || c=='i' || c=='o' || c=='u'|| c=='A'|| c=='E' || c=='I' || c=='O' || c=='U'){
            System.out.println("charector is vowel");
        }
        else {
            System.out.println("charector is constant");
        }
    }
}
