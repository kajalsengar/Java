package ArrayProblems;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array...");
        int n = input.nextInt();
        int array[] = new int[n];
        int i;

        for (i = 0; i < n; i++) {
            array[i] = input.nextInt();

        }
        System.out.println("element of array...");
        for (i = 0; i < n; i++) {
            System.out.print(array[i]+" ");
        }
        int end=n-1;
        int temp;

        for (i=0; i<n/2; i++){
            temp=array[i];
            array[i]=array[end];
            array[end]=temp;
            end--;
        }
        System.out.println(" ");
        System.out.println("reverse of array...");
        for (i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }
}
