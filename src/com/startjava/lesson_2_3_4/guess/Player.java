package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int count;
    private int[] num = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getCount() {
        return count;
    }
    public void inputNum(int number) {
        num[count] = number;
        count++;
    }
    public int getNumber() {
        return num[count - 1];
    }
    public int[] getNum() {
        return Arrays.copyOf(num, count);
    }
    public void resetCells() {
        Arrays.fill(num, 0, count, 0);
        count = 0;
    }
}
