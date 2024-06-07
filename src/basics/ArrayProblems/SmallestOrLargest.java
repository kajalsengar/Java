package basics.ArrayProblems;

import java.util.Scanner;

public class SmallestOrLargest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array..");
        int n= sc.nextInt();
        int array[]= new int[n];

        System.out.println("enter element of array..");
        for (int i=0; i<n; i++)
            array[i]= sc.nextInt();

        int max= array[0];
        int min= array[0];

        for (int i=0; i<n; i++){
            if (max<array[i])
                max=array[i];
            else if (min>array[i])
                min=array[i];
        }
        System.out.println("max="+max+"  "+"min="+min);
    }
}
