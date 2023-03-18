package Algorithms;
public class MissingNumber {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{1, 0, 2}));;
    }

    public static int missingNumber(int[] nums) {
        int missing = -1;

        int i = 0;
        while (i < nums.length){
            int point = nums[i];
            for (int j = 0; j < nums.length; j++) {
                if (point == nums[j] && point == (nums[j] + 1)){
                    break;
                }
                missing = nums[i];
            }
            i++;
        }
        return missing;
    }
}
