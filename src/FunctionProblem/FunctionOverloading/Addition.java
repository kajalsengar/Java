package FunctionProblem.FunctionOverloading;

import java.util.Scanner;

class Operations{
    public double sum , a ,b;
    void add(int a, int b){
        sum =a+b;
        System.out.println("sum of numbers = " +sum);
    }

    void add(double a, int b){
     sum =a+b;
        System.out.println("sum of numbers = " +sum);
    }

    void add(int a ,double b){
      sum = a+b;
        System.out.println("sum of numbers = " +sum);
    }

    void add(double a ,double b){
        sum = a+b;
        System.out.println("sum of numbers = " +sum);
    }
}
public class Addition {
    public static void main(String[] args) {

        Operations obj = new Operations();
        obj.add(4.4,4);

    }
}
