package Algorithms;
public class SingleNumber {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int val = -1, count = 0;

        while(count < nums.length){
            int num = nums[count];
            int found = 0;
            for(int i = 0; i < nums.length; i++){
                if(num == nums[i]){
                    found++;
                }
            }

            if(found == 1){
                val = count;
                break;
            }
            count++;
        }

        return val > - 1 ? nums[val] : 0;
    }
}
