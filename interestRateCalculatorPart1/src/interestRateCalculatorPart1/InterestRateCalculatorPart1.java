package interestRateCalculatorPart1;
import java.util.Scanner;
import java.text.DecimalFormat;

public class InterestRateCalculatorPart1 {
	
	public static Float calcIntAmount(Float intRate, Integer loanAmount) {
		// Data Calculation
		Float intRatePerc = (float)intRate / 100;
		Float intAmount = (float)loanAmount * intRatePerc;
		return intAmount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Elements & Storage
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.##");
		String contLoop = "y";
		
		// Main Script
		System.out.println("Welcome to the interest Calculator\n");
		while (contLoop.toLowerCase().equals("y")) {
			
			// Data Entry
			System.out.print("\nEnter loan amount: ");
			Integer loanAmount = scanner.nextInt();
			System.out.print("Enter interest rate: ");
			Float intRate = scanner.nextFloat();
			
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
