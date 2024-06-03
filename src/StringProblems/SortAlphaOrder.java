package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class SortAlphaOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any string..");
        String str = sc.next();

        char [] array = str.toCharArray();
        Arrays.sort(array);
        System.out.println(array);

        System.out.println(str+"  string sort in alphabatical order is  "+new String(array));

    }
}
