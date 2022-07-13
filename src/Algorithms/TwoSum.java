import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 3}, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int i = 0;
        while (i < nums.length - 1){
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] + nums[j + 1] == target) {
                    result[0] = i;
                    result[1] = j + 1;
                    break;
                }
            }
            i++;
        }
        return result;
    }
}
