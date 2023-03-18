package Algorithms;

public class ValidPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        if (s.trim().isEmpty()){
            return true;
        }
        boolean check = false;

        StringBuilder sb = new StringBuilder();
        String sLower = s.toLowerCase();
        for (int i = 0; i < sLower.length(); i++) {
            char c = sLower.charAt(i);
            if (Character.isLetterOrDigit(c)){
                sb.append(c);
            }
        }

        String result = String.valueOf(sb);
        sb.reverse();

        if (result.equals(String.valueOf(sb))){
            check = true;
        }

        return check;
    }
}
