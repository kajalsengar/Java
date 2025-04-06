package Projects;

import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Stone", "Paper" , "Scissor"};

        System.out.println("Welcome to Stone Paper Scissor Game....");
        System.out.println(" Enter your move (Stone Paper Scissor) ");

        String usermove = scanner.nextLine().trim().toLowerCase();
        int compindex = random.nextInt(3);
        String compmove = choices[compindex].toLowerCase();

        System.out.println(" Computer move is " +compmove);

        if(usermove.equals(compmove)){
            System.out.println("it's tie!");
        } else if (usermove.equals("paper")&&compmove.equals("stone")||
                usermove.equals("scissor")&&compmove.equals("paper")
        || usermove.equals("stone") && compmove.equals("scissor")) {
            System.out.println("Wow you won!...");
        } else if (usermove.equals("stone")||usermove.equals("scissor")||usermove.equals("paper")) {
            System.out.println("oop's you losted!...");
        }else {
            System.out.println("Invalid move!... pls choose (Stone , Paper , Scissor)");
        }
    }
}
