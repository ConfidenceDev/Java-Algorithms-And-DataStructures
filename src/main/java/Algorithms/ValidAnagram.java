package Algorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "art"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        /*char[] c = s.toCharArray();
        char[] d = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        String sortedS = String.valueOf(c);
        String sortedT = String.valueOf(d);

        return sortedS.equals(sortedT);

        if(s.length() != t.length()) {
            return false;
        }*/

        Map<Character, Integer> one = new HashMap<>();
        Map<Character, Integer> two = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            one.put(s.charAt(i), one.getOrDefault(s.charAt(i), 0) + 1);
            two.put(t.charAt(i), two.getOrDefault(t.charAt(i), 0) + 1);
        }

        return one.equals(two);
    }
}
