package Algorithms.Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        System.out.println("Enter your limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        int numberToCheck = 2;
        int count = 0;

        while (true){
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2; factor++){
                if (numberToCheck % factor == 0){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers.add(numberToCheck);
                count++;
                if (count >= limit){
                    break;
                }
            }
            numberToCheck++;
        }

        /*for (int numToCheck = 2; numToCheck <= limit; numToCheck++){
            boolean isPrime = true;
            for (int factor = 2; factor <= numToCheck/2; factor++){
                if (numToCheck % factor == 0){
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                primeNumbers.add(numToCheck);
            }
        }*/

        System.out.println("sort.Prime Numbers from 1 to " + limit + " are: ");
        for (int number : primeNumbers){
            System.out.println(number);
        }
    }
}
