package Algorithms.Sort;

import java.util.Random;

public class Mergesort {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[100];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("\nAfter");
        printArray(numbers);
    }

    private static void mergeSort(int[] array){
        int inputLength = array.length;

        if (inputLength < 2){
            return;
        }

        //Spilt array
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = array[i];
        }

        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = array[i];
        }

        //Recursion
        mergeSort(leftHalf);
        mergeSort(rightHalf);

        //Put back together
        merge(array, leftHalf, rightHalf);
    }

    private static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0, j = 0, k = 0;

        while (i < leftSize && j < rightSize){
            if (leftHalf[i] <= rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            }else {
                array[k] = rightHalf[j];
                j++;
            }
            k++;

            while (i < leftSize){
                array[k] = leftHalf[i];
                i++;
                k++;
            }

            while (j < rightSize){
                array[k] = rightHalf[j];
                j++;
                k++;
            }
        }
    }

    private static void printArray(int[] array){
        for (int num : array){
            System.out.println(num);
        }
    }
}
