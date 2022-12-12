public class MyFirstGame {
    public static void main(String[] args) {
        int num = 85;
        int left = 0;
        int right = 100;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid < num) {
                left = mid + 1;
                System.out.println("Число " + mid + " больше того, что загадал компьютер");
            } else if (mid > num) {
                right = mid - 1;
                System.out.println("Число " + mid + " меньше того, что загадал компьютер");
            } else if (mid == num) {
                num = mid;
                System.out.println("Вы победили! Число компьютера: " + mid);
                break;
            }
        }
    }
}