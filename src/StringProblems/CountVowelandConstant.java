package StringProblems;

import java.util.Scanner;

public class CountVowelandConstant {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter any string..");
        String str= scan.next();
        int vowelCount=0;
        int constCount=0;

        str.toLowerCase();

        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'){
                vowelCount++;
            } else if (str.charAt(i)>'a' && str.charAt(i)<='z') {
                constCount++;
            }
        }
        System.out.println("number of vowel in string = " + vowelCount);
        System.out.println("number of constant in string = " + constCount);
    }
}
