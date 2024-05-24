package PatternProblem;

import java.util.Scanner;

public class InvertedHalf {
    public static void main(String[] args) {
        Scanner star =new Scanner(System.in);
        System.out.println("enter number of row");
        int row = star.nextInt();

        for (int i=row; i>=1; i--){
            for (int j=1; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
