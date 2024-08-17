package DAA_UsingOfJava.Sorting.Basic_Algo;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int i;
        int j;
        int temp=0;
        int swap;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = input.nextInt();
        int[] array = new int[n];

        System.out.println("enter values of array...");
        for (i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("array before swapping...");
        for (i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        for (i=array.length; i>0; i--){
            swap=0;
            for (j=0; j<i-1; j++){
                if (array[j] > array[j+1]) {
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swap=1;
                }
            }

            if (swap != 1){
                break;
            }
        }

        System.out.println(" ");
        System.out.println("Array after sorting...");
        for (i=0 ; i<n; i++){
            System.out.print(array[i]+ " ");
        }
    }
}