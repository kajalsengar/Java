package FunctionProblem;

public class Factorial {
    static void fact(int n){
        int f=1;
        for (int i=n; i>1; i--){
            f=f*i;
        }
        System.out.println(f);
    }

    public static void main(String[] args) {
        fact(5);
    }
}
