package StringProblems;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string..");
        String str = sc.next();
        String rev ="";

        for (int i=str.length()-1; i>=0; i--){
            rev=rev+str.charAt(i);
        }

        if (str.equals(rev)){
            System.out.println("string is palindrom... :)");
        }
    else {
            System.out.println("string is not palindrom... :(");
        }
    }
}
