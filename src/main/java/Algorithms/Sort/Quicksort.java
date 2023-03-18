package Algorithms.Sort;

import java.util.Random;

public class Quicksort {

    public static void main(String[] args) {
        /*int highIndex = 5, lowIndex = 0;
        int test = new Random().nextInt(highIndex);
        System.out.println(test);*/

        Random rand = new Random();
        int[] numbers = new int[1000];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        printArray(numbers);

        quicksort(numbers);

        System.out.println("\nAfter");
        printArray(numbers);
    }

    private static void quicksort(int[] array) {
        quicksort(array, 0, array.length-1);
    }

    private static void quicksort(int[] array, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex){
            return;
        }
        // Choose pivot
        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = array[pivotIndex];
        swap(array, pivotIndex, highIndex);

        //Partition
        int leftPointer = partition(array, lowIndex, highIndex, pivot);
        swap(array, leftPointer, highIndex);

        //Recursion
        quicksort(array, lowIndex, leftPointer - 1);
        quicksort(array, leftPointer + 1, highIndex);
    }

    private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer){
            while (array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while (array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
        return leftPointer;
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    private static void printArray(int[] array){
        for (int num : array){
            System.out.println(num);
        }
    }
}
