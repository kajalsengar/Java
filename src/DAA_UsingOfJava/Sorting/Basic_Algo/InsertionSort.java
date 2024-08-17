package DAA_UsingOfJava.Sorting.Basic_Algo;

public class InsertionSort {
    public static void main(String[] args) {
        int j;
        int i;
        int key;
        int array []= {40,20,60,10,50,30};

        System.out.println("Array before sorting....");
        for (i=0; i<=array.length-1; i++){
            System.out.print(array[i]+ " ");
        }

        for (j=1; j<array.length; j++) {
            key=array[j];
            i=j-1;
            while (i>=0 && array[i]>key){
                array[i+1]=array[i];
                i=i-1;
            }
            array[i+1]=key;
        }
        System.out.println(" ");
        System.out.println("Array after sorting....");
        for (i=0; i<array.length; i++){
            System.out.print(array[i]+ " ");
        }
    }
}
