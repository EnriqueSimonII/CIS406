// Enrique J Simon II CIS406 Interest Rate Calculator Part 2


package interestRateCalculatorPart2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class InterestRateCalculatorPart2 {
	
	public static Float calcIntAmount(Float intRate, Integer loanAmount) {
		// Data Calculation
		Float intRatePerc = (float)intRate / 100;
		Float intAmount = (float)loanAmount * intRatePerc;
		return intAmount;
	}
	
	public static Float validateFloat(Scanner scanner, String promptValue) {
		
		// Elements
		boolean input_Valid = false;
		Float value = 0.0f;
		
		while (!input_Valid) {
			try {
				System.out.print(promptValue);
				value = scanner.nextFloat();
				if (value >= Float.MIN_VALUE && value <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					input_Valid = true;
				}
			} catch (Exception e) {
				System.out.print("\n" + e + ": !!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		return value;
	}
	
	public static Integer validateInteger(Scanner scanner, String promptValue) {
			
			// Elements
			boolean input_Valid = false;
			Integer value = 0;
			
			while (!input_Valid) {
				try {
					System.out.print(promptValue);
					value = scanner.nextInt();
					if (value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE) {
						//System.out.print("Valid");
						input_Valid = true;
					}
				} catch (Exception e) {
					System.out.print("\n" + e + ": !!Invalid Entry try again!!\n");
					scanner.next();
				}
			}
			return value;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Elements & Storage
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.##");
		String loanPrompt = "\nEnter loan amount: ";
		String intPrompt = "Enter interest rate: ";
		String contLoop = "y";
		
		// Main Script
		System.out.println("Welcome to the interest Calculator\n");
		while (contLoop.toLowerCase().equals("y")) {
			
			// Data Entry
			Integer loanAmount = validateInteger(scanner, loanPrompt);
			Float intRate = validateFloat(scanner, intPrompt);
			
			// Data Calculation
			Float intRatePerc = (float)intRate / 100;
			Float intAmount = calcIntAmount(intRate, loanAmount);
			
			// Data Output
			System.out.println("\nLoan Amount -------: $" + df.format(loanAmount));
			System.out.println("Interest rate -----: " + intRate + "%");
			System.out.println("Interest ----------: $" + df.format(intAmount));
			
			// Exit Logic
			while (true) {
				scanner.nextLine();
				System.out.print("\nContinue? (y/n) ---:");
				contLoop = scanner.nextLine();
				
				if (contLoop.toLowerCase().equals("y") || contLoop.toLowerCase().equals("n")) {
					break;
				}
			}
		}
		
		System.out.println("Bye!!!");

	}
}
