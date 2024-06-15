package basics.TwoD_Array;

import java.util.Scanner;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of row...");
        int row = scan.nextInt();
        System.out.println("enter size of column...");
        int column = scan.nextInt();
        int array [][] = new int[row][column];
       // int i,j;

        System.out.println("enter element of array..");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                array[i][j]= scan.nextInt();
            }
        }

        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++) {
                    System.out.print(array[i][j]+" ");
                }
            System.out.println(" ");
            }

        System.out.println("Transpose array...");
        for (int i=0; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
          }
        }
    }

