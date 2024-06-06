package FunctionProblem.FunctionOverloading;

import java.util.Scanner;

class Operations{
    public double sum , a ,b;
    double add(double a, double b){
     sum =a+b;
     return sum;
    }

    double add(double a ,double b, double c){
      sum = a+b;
      return sum;
    }

    double add(double a ,double b,double c, double d){
        sum = a+b;
        return sum;
    }
}
public class Addition {
    public static void main(String[] args) {

        double sum=0;

        Operations obj = new Operations();
        obj.add(4,4);

        System.out.println("sum of numbers = " +sum);
    }
}
