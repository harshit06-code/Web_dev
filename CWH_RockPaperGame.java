package com.company;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner ;

public class CWH_RockPaperGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random generator = new Random();
        System.out.println("Welcome to Rock Paper Scissors game");
        String personPlay ;
        String computerPlay = "";
        int computerInt ;
        System.out.println("Instructions\nR = Rock\tP = Paper\tS = Scissor");
        System.out.println();

        computerInt = generator.nextInt(3)+1;

        if (computerInt==1) {
            computerPlay = "R";
        }
        else if (computerInt==2) {
            computerPlay = "P";
        }
        else if (computerInt==3);
        {
            computerPlay = "S";
        }

        System.out.println("Enter Your play");
        personPlay  = sc.next();
        personPlay = personPlay.toUpperCase();
        System.out.println("Computer's play is "+ computerPlay);

        if (personPlay.equals(computerPlay))
            System.out.println("It's a tie!");
        else if (personPlay.equals("R"))
            if (computerPlay.equals("S"))
                System.out.println("Rock crushes scissors. You win!!");
            else if (computerPlay.equals("P"))
                System.out.println("Paper eats rock. You lose!!");
            else if (personPlay.equals("P"))
                if (computerPlay.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                else if (computerPlay.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
                else if (personPlay.equals("S"))
                    if (computerPlay.equals("P"))
                        System.out.println("Scissor cuts paper. You win!!");
                    else if (computerPlay.equals("R"))
                        System.out.println("Rock breaks scissors. You lose!!");
                    else
                        System.out.println("Invalid user input.");





    }
}
