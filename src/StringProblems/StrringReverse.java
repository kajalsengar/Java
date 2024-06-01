package StringProblems;

import java.util.Scanner;

public class StrringReverse {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter any string..");
        String string = scan.next();
        String reverse = "";

        for (int i =string.length()-1; i>=0; i--){
            reverse=reverse+string.charAt(i);
        }
        System.out.println("Reverse of the string...");
        System.out.println(reverse);
    }
}
