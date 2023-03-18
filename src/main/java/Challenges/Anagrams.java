package Challenges;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	public static boolean isAnagram(String a, String b) {
        char[] c = sort(a);
        char[] d = sort(b);
        
        if (c.length == d.length) {
	        int check = 0;
	        boolean state = false;
	        
	        while(check == 0) {
	        	for (int i = 0; i < c.length - 1; i++) {
	        		if(c[i] != d[i]) {
	        			state = false;
	        			check = 1;
	        			break;
	        		}else state = true; 
	        	}
	        	
	        	check = 1;
	        }
	        
	        return state;
        }else return false;
    }

    public static char[] sort (String s){
        char[] ch = s.toLowerCase().trim().toCharArray();
                
        for(int i = 0; i < ch.length - 1; i++){
        	for(int j = 0 + i; j < ch.length; j++){
                if(ch[i] > ch[j]){
                    char temp = ch[i];
                    ch[i] = ch[j];
                    ch[j] = temp;
                }
            }
        }
        return ch;
    }
}
