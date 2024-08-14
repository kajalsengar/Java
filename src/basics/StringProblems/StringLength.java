package basics.StringProblems;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings...");
        String A= sc.nextLine();
        String B= sc.nextLine();
        int sum;

        sum= A.length()+B.length();
        System.out.println(sum);
    }
}
