package TwoD_Array;

import java.util.Scanner;

public class AverageOfMatrix {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("enter the size of array..");
        int row = scanner.nextInt();
        System.out.println("enter the size of array..");
        int column= scanner.nextInt();
        int sum =0;
        //int average=1;
        int array[][]=new int[row][column];

        System.out.println("enter elements of array");
        for (int i=0 ; i<row; i++){
            for(int j =0; j<column; j++){
                array[i][j]= scanner.nextInt();
            }
        }

        for (int i=0 ; i<row; i++){
            for (int j=0; j<column; j++){
                System.out.print( array[i][j]+" ");
                sum=sum+array[i][j];
            }
            System.out.println(" ");
        }

        System.out.println("sum of elements="+sum);
        int average=sum/row*column;
        System.out.println("average of array="+average);
    }
}
