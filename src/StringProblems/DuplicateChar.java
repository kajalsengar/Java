package StringProblems;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter any string..");
        String str= sc.next();

        for (int i=0; i<str.length();i++){
            for (int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)){
                    System.out.println(str.charAt(j));
                }
            }
        }
    }
}
