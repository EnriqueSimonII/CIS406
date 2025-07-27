// Enrique J Simon II CIS406 Student Registration
package studentRegistration;
import java.util.Scanner;

public class StudentRegistration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Student Registration Form1\n\n");
		
		// Collect Data
		System.out.print("Enter first name: ");
		String firstName = scanner.nextLine();
		System.out.print("Enter last name: ");
		String lastName = scanner.nextLine();
		System.out.print("Enter year of birth: ");
		String birthYear = scanner.nextLine();
		
		// Print Data
		System.out.println("\nWelcome " + firstName + " " + lastName);
		System.out.println("Your registration is complete");
		System.out.println("Your temporary password is: " + firstName + "*" + birthYear);

	}

}
