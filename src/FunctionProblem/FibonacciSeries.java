package FunctionProblem;

public class FibonacciSeries {
    static void fibonacci(int n){
        int num1=0;
        int num2=1;
        int temp=0;

        for (int i=0; i<n; i++){
            System.out.println(num1);
            temp=num1+num2;
            num2=num1;
            num1=temp;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
