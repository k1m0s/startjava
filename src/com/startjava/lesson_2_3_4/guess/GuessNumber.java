package src.com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;

import java.util.Scanner;

import java.util.Random;

public class GuessNumber {

    private Player[] players;
    private int secretNum;
    public static int NUM_RAUNDS = 3;
    public static int MAX_ATTEMPS = 10;
    private int rounds;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void launch() {
        castLots();
        System.out.println("I made a number in the interval (0,100], you have " + MAX_ATTEMPS +
                " attempts to guess the number.");
        generateSecretNum();
        while(!isBegin()) {
            System.out.println("*** New circle ***");
        }
        printNumAttempts();
        rounds++;
        if(rounds == NUM_RAUNDS) {
            conclusionWinner();
            clearScores();
        }
        clearPlayers();
    }

    private void castLots() {
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

    private boolean isBegin() {
        Scanner scan = new Scanner(System.in);
        for(Player player : players) {
            if(player.getCount() >= MAX_ATTEMPS) {
                System.out.println("The Player: " + player.getName() + ", has run out of tries.");
                return true;
            }
            while (true) {
                System.out.print(player.getName() + " entered number: ");
                try {
                    player.addNum(scan.nextInt());
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
        if(player.getNum() == secretNum) {
            player.increment();
            System.out.println("Player: " + player.getName() +
                    ", guessed the number " + secretNum +
                    ", with "  + player.getCount() + " attempts");
            return true;
        }
        String moreLess = (player.getNum() > secretNum) ? ", less" : ", more";
        System.out.println(player.getName() + ", you entered number "
                + player.getNum() + moreLess + " then I guessed.");
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

    private void clearScores() {
        rounds = 0;
        for(Player player : players) {
            player.clearAttempts();
        }
    }

    private void printNumAttempts() {
        for(Player player : players) {
            System.out.print(player.getName() + " entered these numbers: [ ");
            for(int nums : player.getNums()) {
                System.out.print(nums + " ");
            }
            System.out.print("]\n");
        }
    }

    private void clearPlayers() {
        for(Player player : players) {
            player.clearAttempts();
        }
    }
}