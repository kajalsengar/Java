package basics.PatternProblem;

import java.util.Scanner;

public class InvertedFull {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("enter number of row");
        int row = star.nextInt();

        for (int i=row; i>=1; i--){
            for (int j=row; j>=i; j--){
                System.out.print(" ");
            }
            for (int k=i; k>1; k--){
                System.out.print("*");
            }
            for (int l=i; l>=1; l--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
