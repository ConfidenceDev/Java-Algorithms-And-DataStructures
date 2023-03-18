package Challenges;
import java.util.*;

public class Bukateria {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final String welcomeMsg = "\nWelcome to Bukateria Fast Food \nWe\'ve got a variety of options, make your choice: \n\n";
		String menuItems[] = {"Not Ready", "1. Beans - N300", "2. Rice - N500", "3. Shawarmma - N700", 
				"4. Nutri Yo - N150", "5. Indomie - N150", "6. Garri & Soup - N200", "7. Chicken - N1500", "8. Pizza - N2500"};
		
		System.out.print(welcomeMsg);
		
		for (int i = 1; i < menuItems.length; i++) System.out.print(menuItems[i] + "\n");
		
		System.out.print("\nEnter 0 to exit\n\n");
		
		String choice[] = new String[8];
		int pos = 0;
		int total = 0;
		
		while(true) {
			int option = scan.nextInt();
		
			if(option == 0) break;
			
			choice[pos++] = menuItems[option];
			
			int cost = Integer.parseInt(menuItems[option].split(" - N")[1].trim());
			total += cost;
		}
		
		System.out.print("\nYour order:\n");
		for (int j = 0; j < choice.length; j++) {
			if(choice[j] != null)
			System.out.print(choice[j] + "\n");
		};
		
		System.out.print("\nTotal Cost: " + String.valueOf(total) + "\n");
		scan.close();
	}

}
