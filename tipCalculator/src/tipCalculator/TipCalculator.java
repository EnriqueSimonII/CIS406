package tipCalculator;
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Elements & Storage
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###,###,###.##");
		String contLoop = "y";	
		
		// Main Script
		System.out.println("Welcome to the Tip Calculator");
		while (contLoop.toLowerCase().equals("y")) {
			
			System.out.print("\nCost of meal ----: ");
			Float mealCost = scanner.nextFloat();	
			
			for (Float tipPerc = 0.15f; tipPerc <= 0.25f; tipPerc += 0.05f) {
				// Data Calc
				Float tipAmount = mealCost * tipPerc;
				Float totalAmount = mealCost + tipAmount;
				
				// Data Output
				System.out.print("\n" + df.format((tipPerc * 100)) + "%\n");
				System.out.println("Tip Amount ------: $" + df.format(tipAmount));
				System.out.println("Total Amount ----: $" + df.format(totalAmount));
			}
			
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
		
		// Salute
		System.out.println("Bye!!!");

	}

}
