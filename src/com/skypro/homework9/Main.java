package com.skypro.homework9;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
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

    private static void task1() {
        System.out.println("Task 1");
        int[] arr = generateRandomArray();
        int sumMonth = 0;
        for (int sumDay : arr) {
            sumMonth += sumDay;
        }
        System.out.printf("Month spending was: %d", sumMonth);
    }

    private static void task2() {
        System.out.println("\n\nTask 2");
        int[] arr = generateRandomArray();
        int minSpend = arr[0];
        int maxSpend = arr[0];
        for (int daySpend : arr) {
            if (daySpend > maxSpend) {
                maxSpend = daySpend;
            }
            if (daySpend < minSpend) {
                minSpend = daySpend;
            }
        }
        System.out.printf("The minimum amount of spending per day was %d rub. \nThe maximum amount of spending per day was %d rub.", minSpend, maxSpend);
    }

    private static void task3() {
        System.out.println("\n\nTask 3");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int element : arr) {
            sum += element;
        }
        double averageSum = sum / arr.length;
        System.out.println("The average amount of spent per month was " + averageSum + " rub.");
    }

    private static void task4() {
        System.out.println("\nTask 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}
