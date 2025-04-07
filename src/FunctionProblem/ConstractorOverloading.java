package FunctionProblem;

class Hospital{
    int variable1,variable2;
    double variable3;

    public Hospital(int doctors, int nurses){
        variable1=doctors;
        variable2=nurses;
        System.out.println("Doctors =  "+ doctors+"Nurses =  "+nurses );
    }

    public Hospital(int doctors){
        variable1=doctors;
        System.out.println("Doctors =  "+doctors);
    }

    public Hospital(double salary){
        variable3=salary;
        System.out.println("salary =  " +variable3);
    }
}

public class ConstractorOverloading {
    public static void main(String[] args) {
     Hospital hospital= new Hospital(34000.40);

    }
}
