package basics.ArrayProblems;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter size of array");
        int n= scanner.nextInt();
        int array[]=new int[n];
        int count=0;

        System.out.println("enter elemens of array...");
        for (int i=0; i<n; i++){
            array[i]= scanner.nextInt();
        }

        for (int i=0; i<n; i++){
            for (int j=i+1; j<n; j++){
                if (array[i]==array[j]){
                    count++;
                    // break;
                }
            }
        }
        System.out.println("Total duplicate numbers in array "+count);
    }
}
