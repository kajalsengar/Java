package PatternProblem;

import java.util.Scanner;

public class HollowFull {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("enter the row..");
        int row = star.nextInt();

        for (int i=1; i<=row; i++){
            for ( int j=i; j<=row; j++){
                System.out.print(" ");
            }
            for (int k=1; k<i; k++) {
                if (i == row || k == 1) {
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            for (int l=1; l<=i; l++) {
                if (i==row || l==i) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
