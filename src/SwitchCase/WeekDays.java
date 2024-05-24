package SwitchCase;

import java.util.Scanner;

public class WeekDays {  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter week number...");
    int week= sc.nextInt();

    switch(week){

        case 1:
            System.out.println("it's monday");break;
        case 2:
            System.out.println("it's tuesday");break;
        case 3:
            System.out.println("it's wednesday");break;
        case 4:
            System.out.println("it's thursday");break;
        case 5:
            System.out.println("it's friday");break;
        case 6:
            System.out.println("it's saturday");break;
        case 7:
            System.out.println("it's sunday");break;
        default:
            System.out.println("pls choose right number...");
    }
  }
}
