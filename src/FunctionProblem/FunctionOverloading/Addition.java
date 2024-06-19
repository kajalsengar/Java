package FunctionProblem.FunctionOverloading;

class Operations{

    int add(int a, int b){
        return a+b;
    }

    double add(double a, int b){
     return a+b;
    }

    double add(int a ,double b){
     return a+b;
    }

    double add(double a ,double b){
      return a+b;
    }
}
public class Addition {
    public static void main(String[] args) {

        Operations obj = new Operations();
        System.out.println(obj.add(4,5));
        System.out.println(obj.add(5.5,5));
        System.out.println(obj.add(5,.5));
        System.out.println(obj.add(2.2,2.4));
    }
}
