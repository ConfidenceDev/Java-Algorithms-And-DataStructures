import java.util.Arrays;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "art"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String sortedS = String.valueOf(c);
        String sortedT = String.valueOf(d);

        return sortedS.equals(sortedT);
    }
}
