package DAA_UsingOfJava.Sorting.DivideAndConquer;

import java.util.Scanner;

public class Binary_search {
    public static void main(String[] args) {
        int array []= {10,20,30,40,50,60,70};
        int mid = 0;
        int first=0;
        int last= array.length-1;
        int f=0;

        System.out.println(array.length);
        System.out.println("Enter value of finding....");
        Scanner sc= new Scanner(System.in);
        int value= sc.nextInt();

        while (first<=last){
            mid= (first+last)/2;

            if (array[mid]==value) {
             f=1;
             break;
            }
            if (array[mid]<value){
                last=mid+1;
            }
            else {
                first=mid-1;
            }
        }
    if (f==1){
        System.out.println("value find at index= "+ mid);
    }
    else {
        System.out.println("value not find...");
    }
    }
}
