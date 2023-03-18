package Algorithms;

import java.util.Arrays;

public class CountingBits {

    public static void main(String[] args) {
        countBits(5);
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        int i = 0;
        while (i <= n) {
            String bit = Integer.toBinaryString(i);
            int count = 0;
            for (int j = 0; j < bit.length(); j++) {
                char c = bit.charAt(j);
                if (Integer.parseInt(String.valueOf(c)) > 0){
                    count++;
                }
            }
            result[i] = count;
            i++;
        }

        System.out.println(Arrays.toString(result));
        return result;
    }
}
