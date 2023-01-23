package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int secretNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
        do {
            enterNum(player1);
            if(compareGuessNum(player1)) {
                break;
            }
            enterNum(player2);
            if(compareGuessNum(player2)) {
                break;
            }
        } while (player2.getCount() < 10);
        printNumAttempts(player1);
        printNumAttempts(player2);
        player1.resetCells();
        player2.resetCells();
    }

    public void enterNum (Player player) {
        Scanner sc = new Scanner(System.in);
        System.out.print(player.getName() + ", enter the number: ");
        player.inputNum(sc.nextInt());
    }
    public boolean compareGuessNum (Player player) {
        if (player.getNumber() == secretNum) {
            System.out.println("The Win: " + player.getName());
            System.out.println("Player: " + player.getName() +
                    ", guessed the number " + secretNum +
                    ", with "  + player.getCount() + " attempts");
            return true;
        }
        if (player.getNumber() < secretNum) {
            System.out.println("Number " + player.getNumber() + " more than the I'm guess.");
        } else if (player.getNumber() > secretNum) {
            System.out.println("Number " + player.getNumber() + " less than the I'm guess.");
        }
        if(player.getCount() == 10) {
            System.out.println("The, " + player.getName() + " has run out of attempts.");
        }
        return false;
    }
    public void printNumAttempts(Player player) {
        System.out.print(player.getName() + " entered these numbers: [");
        for (int number : player.getNum()) {
            System.out.print(number + " ");
        }
        System.out.print("]\n");
    }
}