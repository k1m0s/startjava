package src.com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

import java.util.Arrays;

public class GuessNumberTest {

    public static int NUM_PLAYERS = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Game << Guess the Number >>");
        GuessNumber game = new GuessNumber(createPlayers());
        String answer = "yes";
        do {
            if ("yes".equals(answer)) {
                game.launch();
            }
            System.out.print("Do you want to continue the game? [yes/no]: ");
            answer = sc.nextLine();
        } while (!"no".equals(answer));
    }

    private static Player[] createPlayers() {
        Player[] players = new Player[NUM_PLAYERS];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < NUM_PLAYERS; i++) {
            System.out.print("Player " + (i + 1) + " entered the name: ");
            players[i] = new Player(scan.nextLine());
        }
        return  players;
    }
}