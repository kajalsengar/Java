package FunctionProblem.FunctionOverriding;

class Tea {
    void tea(){
        System.out.println("Tea is ready.....");
    }
}
class BlackTea extends Tea {
    @Override
    void tea() {
        System.out.println("Black Tea is ready.....");
    }
}
class GreenTea extends Tea{
    @Override
    void tea() {
        System.out.println("Green tea is ready.....");
    }
}
class YellowTea extends Tea{
    @Override
    void tea() {
        System.out.println("Yellow tea is ready.....");
    }
}
public class MakeTea {
    public static void main(String[] args) {
        //Tea obj = new Tea();
      //  obj.tea();
        YellowTea obj1 = new YellowTea();
        obj1.tea();
    }
}
