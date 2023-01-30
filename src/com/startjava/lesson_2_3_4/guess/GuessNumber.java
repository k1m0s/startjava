package src.com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {

    private Player[] players;
    private int secretNum;
    public static int NUM_RAUNDS = 3;
    public static int MAX_ATTEMPS = 4;
    private int rounds;


    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void launch() {
        costLost();
        System.out.println("I made a number in the interval (0,100], you have " + MAX_ATTEMPS +
                " attempts to guess the number.");
        generateSecretNum();
        while(!step()) {

        }
        rounds++;
        if(rounds == NUM_RAUNDS) {
            conclusionWinner();
            printNumAttempts();
            resetScores();
        }
        resetPlayers();
    }

    private void costLost() {
        for(int i = players.length - 1; i > 1; i--) {
            int j = (int) (Math.random() * i);
            Player temp = players[j];
            players[j] = players[i];
            players[i] = temp;
        }
    }

    private void generateSecretNum() {
        Random random = new Random();
        secretNum = random.nextInt(100) + 1;
    }

    private boolean step() {
        Scanner scan = new Scanner(System.in);
        for(Player player : players) {
            if(player.getCount() >= MAX_ATTEMPS) {
                System.out.println("The Player: " + player.getName() + ", has run out of tries.");
                return true;
            }
            while (true) {
                System.out.print(player.getName() + " entered number: ");
                try {
                    player.inputNum(scan.nextInt());
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("ERROR: " + e.getMessage());
                }
            }
            if(compareNums(player)) {
                return true;
            }
        }
        return false;
    }

    private boolean compareNums(Player player) {
        if(player.getNumber() == secretNum) {
            player.score();
            System.out.println("Player: " + player.getName() +
                    ", guessed the number " + secretNum +
                    ", with "  + player.getCount() + " attempts");
            return true;
        }
        String moreLess = player.getNumber() > secretNum ? ", less" : ", more";
        System.out.println(player.getName() + ", you entered number "
                + player.getNumber() + moreLess + " then I guessed.");
        return false;
    }

    private void conclusionWinner() {
        int maxScore = 0;
        int countWinner = 0;
        for(Player player : players) {
            int score = player.getCount();
            if (score > maxScore) {
                maxScore = score;
                countWinner = 1;
            } else if (score == maxScore) {
                countWinner++;
            }
        }
        if (countWinner == 1) {
            System.out.println("Winner: ");
        } else {
            System.out.println("Winners: ");
        }
        for(Player player : players) {
            if(player.getCount() == maxScore) {
                System.out.println("*** " + player.getName() + " ***");
            }
        }
        System.out.println();
    }

    private void resetScores() {
        rounds = 0;
        for(Player player : players) {
            player.resetCells();
        }
    }

    private void printNumAttempts() {
        for(Player player : players) {
            System.out.print(player.getName() + " entered these numbers: [ ");
            for(int num : player.getNum()) {
                System.out.print(num + " ");
            }
            System.out.print("]\n");
        }
    }

    private void resetPlayers() {
        for(Player player : players) {
            player.resetCells();
        }
    }
}