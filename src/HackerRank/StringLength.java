package HackerRank;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings....");
        String A= sc.nextLine();
        String B= sc.nextLine();
        int sum;

        sum= A.length()+B.length();
        System.out.println(sum);

        if (A.compareTo(B) >0){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

        A= (A.substring(0,1)).toUpperCase()+A.substring(1);
        B= (B.substring(0,1)).toUpperCase()+B.substring(1);

        System.out.println(A+ " " +B);
    }
}
