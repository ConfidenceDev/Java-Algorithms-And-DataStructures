public class ReverseBits {

    public static void main(String[] args) {
        //Wrong Solution
        //reverseBits(1010);
    }

    public static int reverseBits(int n) {
        StringBuilder bits = new StringBuilder(String.valueOf(n));
        String right = String.valueOf(bits.reverse());
        int result = (int) Long.parseLong(right, 2);

        System.out.println(right + " : " + result);
        return result;
    }
}
