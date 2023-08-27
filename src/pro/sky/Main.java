package pro.sky;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2ForEach();
        task2For();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void  task1() {
        System.out.println("Task 1");
        int sum = 0;
        int [] arr = generateRandomArray();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2ForEach() {
        System.out.println("Task 2 foreach");
        int[] arr = generateRandomArray();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i:arr) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей", min);
        System.out.printf("\nМаксимальная сумма трат за день составила %d рублей", max);
    }

    public static void task2For() {
        System.out.println("\nTask 2 for");
        int [] arr = generateRandomArray();
        int max = -1;
        int min = 999_999_999;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей", min);
        System.out.printf("\nМаксимальная сумма трат за день составила %d рублей", max);
    }
    public static void task3() {
        System.out.println("\nTask 3");
        int [] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        float average = (float) sum / arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", average);
    }
    public static void task4() {
        System.out.println("\nTask 4");
        int [] arr = generateRandomArray();
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
