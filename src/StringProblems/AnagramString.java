package StringProblems;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter first string...");
        String str1 = input.next();

        System.out.println("enter second string...");
        String str2 = input.next();

        str1.toLowerCase();
        str2.toLowerCase();

        if (str1.length() == str2.length()) {
            char[] array1 = str1.toCharArray();
            char[] array2 = str2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            if (Arrays.equals(array1,array2)){
                System.out.println("string is anagram..");
            }else {
                System.out.println("string is not anagram..");
            }
        }else {
            System.out.println("string is not anagram..");
        }
    }
}
