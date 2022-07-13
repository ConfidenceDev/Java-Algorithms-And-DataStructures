package sort;

import java.util.Random;

public class Bubblesort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        boolean swapped = true;
        while (swapped){
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++){
                if (numbers[i] > numbers[i + 1]){
                    swapped = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }
        }

        System.out.println("\nAfter");
        printArray(numbers);
    }

    private static void printArray(int[] array){
        for (int num : array){
            System.out.println(num);
        }
    }
}
