package basics.PatternProblem;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        int number = sc.nextInt();

        for (int i=1; i<=number; i++){
            for (int j=1; j<=i; j++){
//                System.out.print(i);
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
