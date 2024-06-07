package FunctionProblem.BasicFunction;

import java.util.Scanner;

class power{
    void user(int base, int pow){
        int result=1;
        for (int i=pow; i>=1; i--){
            result=result*base;
        }
        System.out.println(result);
    }
}

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter base number....");
        int base= sc.nextInt();
        power obj=new power();
        obj.user(base,3);
    }
}
