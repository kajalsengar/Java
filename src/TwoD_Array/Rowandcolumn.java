package TwoD_Array;

import java.util.Scanner;

public class Rowandcolumn {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("enter size of row...");
        int row= scan.nextInt();
        System.out.println("enter size of colomn...");
        int column= scan.nextInt();
        int array[][]=new int[row][column];

        System.out.println("enter number of array....");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                array[i][j]= scan.nextInt();
            }
        }
        int sum=0;
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                sum=sum+array[i][j];
                //    System.out.println(array[i][j]);
            }
         //2   System.out.println("sum of elements of array "+sum);
        }
        System.out.println("sum of elements of array "+sum);
    }
}
