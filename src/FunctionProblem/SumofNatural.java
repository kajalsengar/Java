package FunctionProblem;

import java.util.Scanner;

class Number{
    void sum(int a){
        int s=0;
        for (int i=1; i<=a; i++){
            s=s+i;
        }
        System.out.println(s);
    }
}

public class SumofNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of N");
        int n = input.nextInt();
        Number obj= new Number();
        obj.sum(n);
    }
}
