public class ContainsDuplicate {

    public static void main(String[] args) {
        // Time Limit Exceeded
        System.out.println(containsDuplicate(new int[]{1, 2, 3 , 4}));

        // More Accurate
        /*Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                return true;
            }
            uniques.add(nums[i]);
        }
        return false;*/
    }

    public static boolean containsDuplicate(int[] nums) {
        boolean contains = false;
        int i = 0;
        while (i < nums.length){
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if (count > 1){
                contains = true;
            }
            i++;
        }
        return contains;
    }
}
