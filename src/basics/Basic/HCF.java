package basics.Basic;

import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        int first = input.nextInt();
        System.out.println("enter second number");
        int second = input.nextInt();
        System.out.println(first+"   "+second);

        int hcf=1;
        if (second>first){
            int temp = second;
            second = first;
            first = temp;
        }

        for (int i =1; i<=second; i++){
            if (first%i==0 && second%i==0){
                hcf = i;
            }
        }
        System.out.println("hcf ="+hcf);
    }
}
