package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

import java.util.Arrays;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game << Guess the Number >> \n");
        System.out.print("Hey Player 1 \nEnter the name: ");
        Player player1 = new Player(sc.nextLine());
        System.out.print("Hey Player 2 \nEnter the name: ");
        Player player2 = new Player(sc.nextLine());
        System.out.println("\n" + player1.getName() + " & " + player2.getName() + 
                ", I made a number in the interval (0,100], you have 10 attempts to guess the number.");
        GuessNumber game = new GuessNumber(player1, player2);
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.launch();
            }
            System.out.print("Do you want to continue the game? [yes/no]: ");
            answer = sc.nextLine();
        } while (!"no".equals(answer));
    }
}