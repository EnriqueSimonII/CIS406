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
		System.out.print("Enter COuntry Visted: ");
		String countryVisted = scanner.nextLine();
		System.out.print("Enter number of days: ");
		String numDays = scanner.nextLine();
		System.out.print("Enter mode of travel (car, airplane, ship, train, bus): ");
		String modeTravel = scanner.nextLine();
		
		// Print Data
		System.out.println("Details of your trip:\n");
		System.out.print("Date: " + startDate);
		System.out.print("City: " + cityVisted);
		System.out.print("Country: " + countryVisted);
		System.out.print("Number of Days: " + numDays);
		System.out.print("Traveled By: " + modeTravel);
		System.out.print("Bye!!!");
		
	}

}
