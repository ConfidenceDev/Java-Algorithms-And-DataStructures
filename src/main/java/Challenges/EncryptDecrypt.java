package Challenges;
import java.util.Scanner;

public class EncryptDecrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		String msg = scan.next();
		msg += scan.nextLine();
		
		char[] arr = msg.toCharArray();
		int key = 6;
		
		//Encrypt(key, arr);
		Decrypt(key, arr);
		scan.close();
	}
	
	public static char Encrypt(int key, char[] arr) {
		char v = 0;
		
		for(char c : arr) {
			c += key;
			System.out.print(c);
		}
		
		return v;
	}

	
	public static char Decrypt(int key, char[] arr) {
		char v = 0;
		
		for(char c : arr) {
			c -= key;
			System.out.print(c);
		}
		
		return v;
	}

}
