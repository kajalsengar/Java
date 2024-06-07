package basics.StringProblems;

import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter any string..");
        String string = sc.nextLine();
        System.out.println("before removing white spaces= "+string);

        String str = string.replaceAll("\\s","");
        System.out.println("after removing white spaces= "+str);

    }
}
