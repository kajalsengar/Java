package PrecticeQuestions;

import java.util.Scanner;

public class SecondMaxorMinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array..");
        int n = sc.nextInt();
        int array []= new  int [n];

        System.out.println("Enter number of array..");
        for (int i =0; i<n; i++){
            array[i]= sc.nextInt();
        }

        int max=array[0];
        int min=array[0];

        for (int i=0; i<n; i++){
            if (max<array[i]) {
                max = array[i];
            }
            else if (min >array[i])
                min =array[i];
        }

        int smax=array[0];
        int smin =array[0];

        for (int i =0; i<n; i++){
            if(array[i]!=max && smax<array[i]){
                smax=array[i];
            } else if (array[i]<min && smin>array[i]) {
                smin=array[i];
            }
        }

        System.out.println("max= "+max +"  min= "+ min);
        System.out.println("Second max= "+smax +"  second min= "+ smin);
    }
}
