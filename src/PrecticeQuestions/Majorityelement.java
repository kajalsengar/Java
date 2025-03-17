package PrecticeQuestions;

import java.util.Arrays;

public class Majorityelement {
    public static void main(String[] args) {
        int [] arr ={1,3,2,1,3,2,1,2};
        int count =1;

        Arrays.sort(arr);

        for( int i =0; i<arr.length; i++){
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

     for (int i =0 ; i<arr.length; i++){
         for (int j =0; j< arr.length; j++){
             if(arr[i]==arr[j]){
                 count++;
             }
         }
         if (count> arr.length/2){
             System.out.print(arr[i]+" ");
         }else {
             count=1;
         }

     }
    }
}
