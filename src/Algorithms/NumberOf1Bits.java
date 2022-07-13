public class NumberOf1Bits {

    public static void main(String[] args) {
        hammingWeight(32);
    }

    public static int hammingWeight(int n) {
        String binary = Integer.toBinaryString(n);
        int count = 0;
        for (int i = 0; i < binary.length(); i++){
            char c = binary.charAt(i);
            if (Integer.parseInt(String.valueOf(c)) > 0){
                count++;
            }
        }

        System.out.println(binary + " : " + count);
        return count;
    }
}
