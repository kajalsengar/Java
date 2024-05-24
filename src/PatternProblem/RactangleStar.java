package PatternProblem;

import java.util.Scanner;

public class RactangleStar {
    public static void main(String[] args) {
        Scanner tringle= new Scanner(System.in);
        System.out.println("enter any number");
        int number = tringle.nextInt();
        int result = 1;

        for (int i=0; i<number; i++){
            for (int j=0; j<=i; j++){
                if (j==0 || j==i){
                    result=1;
                    System.out.print(result);
                }
                else {
                    result= result*(i-j+1)/j;
                    System.out.print(result);
                }
            }
            System.out.println(" ");
        }
    }
}
