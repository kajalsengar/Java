package PrecticeQuestions;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {2,4,3,6,5};
        int temp = 0;
        int end= arr.length-1;

        System.out.println("Elements of array...");
        for (int i=0; i<= end; i++){
            System.out.print(arr[i] +" ");
        }

        for(int i=0; i<=end/2; i++){
           temp= arr[i];
           arr[i]= arr[end];
           arr[end]=temp;
           end--;
        }
        System.out.println(" ");
        System.out.println("Reverse of the array...");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
