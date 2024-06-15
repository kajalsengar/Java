package basics.TwoD_Array;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of row...");
        int row = sc.nextInt();
        System.out.println("enter size of column...");
        int column = sc.nextInt();
        int array[][] = new int[row][column];

        System.out.println("enter element of array..");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        //for printing...
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }

        //for sum of elements
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum = sum + array[i][j];
            }
        }
        System.out.println("sum of elements = " + sum);
    }
}
