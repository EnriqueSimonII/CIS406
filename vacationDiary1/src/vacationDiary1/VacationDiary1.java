// Enrique J Simon CIS406 Vacation Diary 1

package vacationDiary1;
import java.util.Scanner;

public class VacationDiary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Vacation Diary\n\n");
		
		// Collect Data
		System.out.print("Enter Date Vacation Started (mm/dd/yyyy): ");
		String startDate = scanner.nextLine();
		System.out.print("Enter City Visted: ");
		String cityVisted = scanner.nextLine();
		System.out.print("Enter Country Visted: ");
		String countryVisted = scanner.nextLine();
		System.out.print("Enter number of days: ");
		String numDays = scanner.nextLine();
		System.out.print("Enter mode of travel (car, airplane, ship, train, bus): ");
		String modeTravel = scanner.nextLine();
		
		// Print Data
		System.out.println("\nDetails of your trip:");
		System.out.println("Date: " + startDate);
		System.out.println("City: " + cityVisted);
		System.out.println("Country: " + countryVisted);
		System.out.println("Number of Days: " + numDays);
		System.out.println("Traveled By: " + modeTravel);
		System.out.println("Bye!!!");
		
	}

}
