package PatternProblem;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner star = new Scanner(System.in);
        System.out.println("enter number of row");
        int row = star.nextInt();

        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
