package FunctionProblem;

 class Example {
    void question(int n1,int n2){
        int temp;
        int gcd=1;
        if(n1<n2){
            temp=n1;
            n1=n2;
            n2=temp;
        }
        for (int i=1; i<=n2; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd =i;
            }
        }
        System.out.println(gcd);
    }
}

public class GCD {
    public static void main(String[] args) {
        Example obj =new Example();
        obj.question(40,35);
    }
}
