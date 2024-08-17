package DAA_UsingOfJava.Sorting.Basic_Algo;

public class SelectionSort {
    public static void main(String[] args) {
        int i;
        int j;
        int min;
        int temp;

        int array []= {20,10,50,60,40,30};
        System.out.println("Array before sorting...");
        for (i=0; i< array.length ; i++){
            System.out.print(array[i]+ " ");
        }

        for (i=0; i< array.length; i++){
            min=i;

            for (j=i+1; j< array.length; j++){
                if (array[j]<array[min]){
                    min=j;
                }
            }

            if(min!=i){
                temp=array[min];
                array[min]=array[i];
                array[i]=temp;
            }
        }

        System.out.println(" ");
        System.out.println("Array after sorting...");
        for (i=0; i<= array.length-1; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
