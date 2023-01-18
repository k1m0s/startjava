package com.startjava.lesson_2_3.guess;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        int secretNum = random.nextInt(100) + 1;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print(player1.getName() + ", enter the number: ");
            player1.setNumber(sc.nextInt());
            if (player1.getNumber() == secretNum) {
                System.out.println("The Win: " + player1.getName());
                break;
            }
            if (player1.getNumber() < secretNum) {
                System.out.println("Number " + player1.getNumber() + " more than the I'm guess.");
            } else if (player1.getNumber() > secretNum) {
                System.out.println("Number " + player1.getNumber() + " less than the I'm guess.");
            }

            System.out.print(player2.getName() + ", enter the number: ");
            player2.setNumber(sc.nextInt());
            if (player2.getNumber() == secretNum) {
                System.out.println("The Win: " + player2.getName());
                break;
            }
            if (player2.getNumber() < secretNum) {
                System.out.println("Number " + player2.getNumber() + " more than the I'm guess.");
            } else if (player2.getNumber() > secretNum) {
                System.out.println("Number " + player2.getNumber() + " less than the I'm guess.");
            }
        }
    }
}