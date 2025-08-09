// Enrique J Simon II CIS406 Travel Time Converter

package travelTimeConverter;
import java.util.Scanner;

public class TravelTimeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Travel Time Converter\n");
		
		// Collect Data
		System.out.print("Enter Miles: ");
		Integer miles = scanner.nextInt();
		System.out.print("Enter miles per hour: ");
		Integer mph = scanner.nextInt();
		
		// Output
		System.out.println("\nEstimated travel time\n---------------------");
		System.out.println("Hours: " + (int) Math.floor((miles / mph)));
		System.out.println("Minutes: " + (miles % mph));
		
		// Exit
		System.out.println("\nBye!");

	}

}
