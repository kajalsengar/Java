package DAA_UsingOfJava.Sorting;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int i;
        int j;
        int temp;
        int swap;
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = input.nextInt();
        int[] array = new int[n];

        for (i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("array before swapping...");
        for (i=0; i<n; i++){
            System.out.print(array[i] + " ");
        }

        for (i=array.length-1; i>0; i--){
            swap=0;
            for (j=0; j<i; j++){
                if (array[j] > array[j+1]) {
                    temp=array[j];
                    array[j+1]=array[j];
                    array[j]=temp;
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