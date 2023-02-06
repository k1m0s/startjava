package src.com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int count;
    private int[] nums = new int[10];
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }

    public void addNum(int num) {
        if(num <= 0 || num > 100) {
            throw new IllegalArgumentException("Number in interval (0, 100]. Try again");
        }
        nums[count] = num;
        count++;
    }

    public int getNum() {
        return nums[count - 1];
    }

    public int[] getNums() {
        return Arrays.copyOf(nums, count);
    }

    public void clearAttempts() {
        Arrays.fill(nums, 0, count, 0);
        count = 0;
    }

    public void increment() {
        score++;
    }
}
