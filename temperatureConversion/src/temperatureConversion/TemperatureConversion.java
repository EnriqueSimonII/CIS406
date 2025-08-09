// Enrique J Simon II CIS406 Temperature Conversion

package temperatureConversion;
import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Converter\n");
		
		// F to C
		System.out.print("Enter degrees in Fahrenheit: ");
		Integer fDegrees = scanner.nextInt();
		System.out.println("Degreen in Celcius: " + (int)((fDegrees - 32) * 0.5555555555555556) + "\n");

		// C to F
		System.out.print("Enter degrees in Celcius: ");
		Integer cDegrees = scanner.nextInt();
		System.out.println("Degreen in Fahrenheit: " + (int)((cDegrees * 1.8) + 32) + "\n");
		
		// Exit
		System.out.println("Bye!");
	}

}
