package Challenges;

import java.util.Scanner;

public class SubstringComparisons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        System.out.println(getSmallestAndLargest(s, k));
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "", largest = "";
        String[] subArray = new String[s.length()];
        int i = 0;
                
        for(i = 0; i < s.length() - (k - 1); i++) {
        	subArray[i] = s.substring(i, k + i);
        }
        
        String[] newArray = new String[i];
        for(int j = 0; j <= i; j++) {
        	if (subArray[j] != null) {
        		newArray[j] = subArray[j];
        	}
        }
        
        newArray = sort(newArray);
        
        smallest = newArray[0];
        largest = newArray[i - 1];
        
        return smallest + "\n" + largest;
	}
	
	public static String[] sort(String[] sortArray) {	
		for(int i = 0; i < sortArray.length - 1; i++) {
			for(int j = 0 + i; j < sortArray.length; j++) {
				if(sortArray[i].charAt(0) > sortArray[j].charAt(0)) {
					String t = sortArray[i];
					sortArray[i] = sortArray[j];
					sortArray[j] = t;
				}
			}			
		}
		return sortArray;
	}
}
