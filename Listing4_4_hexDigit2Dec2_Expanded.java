package chapter4;

import java.util.Scanner;

public class Listing4_4_hexDigit2Dec2_Expanded {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Ask for a hex and read it using Scanner
		System.out.println("Enter a HEX digit: ");
		String hexString = input.nextLine();
		
		// Check if the Scanner input has only one input
		if (hexString.length() < 1) {
			System.out.println("You must enter only one character.");
			System.exit(1);
		}
		
		// Display value for the HEX value entered
		double value = 0;//total for each value entered.
		int toThePowerOf = 0; // Power to be raised to in HEX system. 16^0
		double sumOfAllNumbers = 0; // Sum of all values
		
		/*Start for loop*/
		for (int i = hexString.length() - 1; i >= 0; i--) {
			char ch = Character.toUpperCase(hexString.charAt(i));
			if (ch <= 'F' && ch >= 'A') {
				value = ch - 'A' + 10;
				value = Math.pow(16, toThePowerOf) * value;
				toThePowerOf++;
				System.out.println("The decimal/Letter value for HEX is: " + value);
			} else if (Character.isDigit(ch)) {
				String ch1 = String.valueOf(ch);
				int numberEntered = Integer.parseInt(ch1);
				value = Math.pow(16, toThePowerOf) * numberEntered;
				toThePowerOf++;
				System.out.println("The decimal/digit value for HEX is: " + value);
			} else {
				System.out.println("Character is invalid.");
			}
			sumOfAllNumbers += value;
			
		} // Close for loop
		System.out.println("Sum: " + sumOfAllNumbers);
		
		// Close Scanner input
		input.close();
	}
	
}
