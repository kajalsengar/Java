package ArrayProblems;
import java.util.Scanner;

public class AverageOfNumber {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("enter size of array");
            int n= input.nextInt();
            double sum=0;
            double avg;
            int i;
            System.out.println("enter elements...");
            int array [] = new int[n];

            for (i=0; i<n; i++){
                array[i] = input.nextInt();
                sum=sum+array[i];
            }
            avg=sum/n;
            System.out.println("sum of number="+sum);
            System.out.println("average of numbers="+avg);
        }
}
