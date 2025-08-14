// Enrique J Simon II CIS406 Power Tables

package powersTable;
import java.util.Scanner;

public class PowerTables {

	public static void main(String[] args) {
	
		// Intro & Objects
		System.out.println("Welcome to the Squares and Cubes table");
		Scanner scanner = new Scanner(System.in);
		String cont_loop = "y";
		
		// Loop Operations
		while (cont_loop.equalsIgnoreCase("y")) {
			
			// User Input
			System.out.print("\nEnter an  integer: ");
			Integer num_rows = scanner.nextInt();
			scanner.nextLine();
			
			// Headers
			System.out.println("\nNumber\tSquared\tCubed");
			System.out.println("======\t=======\t====");
			
			// Table Print
			for (int i = 1; i <= num_rows; i++) {
				System.out.println(String.valueOf((int)Math.pow(i, 1)) + "\t" + 
								   String.valueOf((int)Math.pow(i, 2)) + "\t" + 
								   String.valueOf((int)Math.pow(i, 3)));
			}
			
			// Exit Logic
			System.out.print("\nContinue? (y/n): ");
			cont_loop = scanner.next().trim();
			
			if (cont_loop.equalsIgnoreCase("n")) {
				System.out.println("\nBye!!");
				break;
			}
		}
		
	}

}
