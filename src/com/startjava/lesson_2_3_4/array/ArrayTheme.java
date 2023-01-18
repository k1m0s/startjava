package src.com.startjava.lesson_2_3_4.array;
import java.util.Arrays;
public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("1 - Реверс значений массива.");
        int[] numbers = {2, 3, 1, 7, 6, 5, 4};
        int len = numbers.length;
        System.out.print("Origin Array: ");
        printArray(numbers);
        System.out.print("Revers Array: ");
        for(int i = 0; i < len / 2; i++) {
            int temp = numbers[len - i - 1];
            numbers[len - i - 1] = numbers[i];
            numbers[i] = temp;
        }
        printArray(numbers);

        System.out.println("\n2 - Вывод произведения элементов массива.");
        int[] elementArray = new int[10];
        len = elementArray.length;
        int result = 1;
        for(int i = 0; i < len; i++) {
            elementArray[i] = i;
        }
        for(int i = 1; i < len - 1; i++) {
            result *= elementArray[i];
            System.out.print(elementArray[i] +((i < len - 2) ? " * " : " = " + result));
        }
        System.out.print("\n" + "Index[" + elementArray[0] + "] Index[" + elementArray[9] + "]");

        System.out.println("\n\n3 - Удаление элементов массива.");
        double[] doubleArray = new double[15];
        len = doubleArray.length;
        System.out.print("Origin Array:");
        for (int i = 0; i < len; i++) {
            doubleArray[i] = Math.random();
        }
        printDoubleArray(doubleArray);
        System.out.print("\nChanged Array:");
        int zeroCount = 0;
        double middleNum = doubleArray[len / 2];
        for (int i = 0; i < len; i++) {
            if (doubleArray[i] > middleNum) {
                doubleArray[i] = 0;
                zeroCount++;
            }
        }
        printDoubleArray(doubleArray);
        System.out.println("\nNumber of Zeroed cells: " + zeroCount);

        System.out.println("\n4 - Вывод элементов массива лесенкой в обратном порядке.");
        char[] alphabet = new char[26];
        len = alphabet.length;
        for(int i = 0; i < len; i++) {
            alphabet[i] = (char) ('A' + i);
        }
        for(int i = len - 1; i >= 0; i--){
            for(int j = len - 1; j >= i; j--) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }

        System.out.println("\n5 - Генерация уникальных чисел.");
        int[] uniqueNums = new int[30];
        len = uniqueNums.length;
        for (int i = 0; i < len; i++) {
            int randomNum;
            boolean unique;
            do {
                randomNum = (int) (Math.random() * 40 + 60);
                unique = false;
                for(int j = 0; j < i; j++) {
                    if(randomNum == uniqueNums[j]) {
                        unique = true;
                        break;
                    }
                }
            } while (unique);
            uniqueNums[i] = randomNum;
        }
        for (int i = len - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (uniqueNums[j] > uniqueNums[j + 1]) {
                    int temp = uniqueNums[j];
                    uniqueNums[j] = uniqueNums[j + 1];
                    uniqueNums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.printf("%3d", uniqueNums[i]);
            if ((i + 1)  % 10 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n6 - Сдвиг элементов массива.");
        String[] originArray = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        int length = 0;
        for(String s : originArray) {
            if(!s.isBlank()) {
                length++;
            }
        }
        String[] changedArray = new String[length];
        length = originArray.length;
        for(int i = 0, j = 0; i < length; i++) {
            int srcPos = 0;
            while((!originArray[i].isBlank()) && (i < length -1)) {
                srcPos++;
                i++;
            }
            System.arraycopy(originArray, i - srcPos, changedArray, j, srcPos);
            j += srcPos;
        }
        System.out.println(Arrays.toString(originArray));
        System.out.println(Arrays.toString(changedArray));
    }

    private static void printArray(int[] numbers) {
        for (int number : numbers ) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
    private static void printDoubleArray(double[] doubleArray) {
        for (int i = 0; i < doubleArray.length; i++) {
            if (i % 8 == 0) {
                System.out.println();
            }
            System.out.printf("%7.3f", doubleArray[i]);
        }
    }
}
