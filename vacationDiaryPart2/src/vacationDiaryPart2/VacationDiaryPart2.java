// Enrique J Simon CIS406 Vacation Diary 2

package vacationDiaryPart2;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class VacationDiaryPart2 {
	
	public static Integer validateDate(Scanner scanner, String promptValue) {
			
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
	
	public static Integer validateDays(Scanner scanner, String promptValue) {
		
		// Elements
		boolean input_Valid = false;
		Integer value = 0;
		
		while (!input_Valid) {
			try {
				System.out.print(promptValue);
				value = scanner.nextInt();
				
				if (value >= 1 && value <= 30) {
					//System.out.print("Valid");
					input_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
					scanner.next();
				}
			} catch (Exception e) {
				System.out.print("\n" + e + ": !!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		return value;
	}
	
	public static String validateLocation(Scanner scanner, String promptValue) {
		
		// Elements
		boolean input_Valid = false;
		String value = " ";
		
		while (!input_Valid) {
			System.out.print(promptValue);
			value = scanner.nextLine().toLowerCase().trim();
			
			if (value.length() >= 15) {
				value = value.substring(0, 15);
				input_Valid = true;
				
			} else if (value.length() < 15) {
				value = value + " ".repeat(15 - value.length());
				input_Valid = true;
			}
		}
		return value;
	}
	
	public static String validateMode(Scanner scanner, String promptValue) {
		
		// Elements
		boolean input_Valid = false;
		String value = " ";
		
		while (!input_Valid) {
			System.out.print(promptValue);
			value = scanner.nextLine().toLowerCase().trim();
			
			if (value.equals("car") || value.equals("airplane") || value.equals("ship") || value.equals("train") || value.equals("bus")) {
				input_Valid = true;
				
			} else {
				System.out.print("!!Invalid Entry try again!!\n");
			}
		}	
		return value;
	}
	
	public static String convertDate(Integer numDate) {
		
		String strDate = String.valueOf(numDate);
		if (strDate.length() == 7) {
			strDate = "0" + strDate;
			return strDate;
		} else {
			return strDate;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Elements
		Scanner scanner = new Scanner(System.in);
		String exitEntry = "y";
		String bannerChar = "-";
		String datePrompt = "Enter Date Vacation Started (mm/dd/yyyy) ---------------: ";
		String cityPrompt = "Enter City Visted --------------------------------------: ";
		String countryPrompt = "Enter Country Visted -----------------------------------: ";
		String numDaysPrompt = "Enter number of days -----------------------------------: ";
		String modePrompt = "Enter mode of travel (car, airplane, ship, train, bus) -: ";
		
		// Storage
		List<List> diaryTable = new ArrayList<>();
		List<String> headerRow = new ArrayList<>(Arrays.asList("   Date Visted   ", 
															   "   City Visted   ", 
															   "   Country Vistsed   ",
															   "   Number of Days   ",
															   "   Mode of Travel   "));
		
		// Data Entry
		System.out.print("Vacation Diary\n\n");
		while (exitEntry.equals("y")) {
		
			// Collect Data
			List<String> tempEntry = new ArrayList<>();
			Integer startDate = validateDate(scanner, datePrompt);
			String dateBase = convertDate(startDate);
			scanner.nextLine();
			String cityVisted = validateLocation(scanner, cityPrompt);
			String countryVisted = validateLocation(scanner, countryPrompt);
			Integer numDays = validateDays(scanner, numDaysPrompt);
			scanner.nextLine();
			String modeTravel = validateMode(scanner, modePrompt);
			
			// Add To Diary
			tempEntry.add(dateBase.substring(0, 2) + "/" + dateBase.substring(2, 4) + "/" + dateBase.substring(4, 8));
			tempEntry.add(String.valueOf(cityVisted));
			tempEntry.add(String.valueOf(countryVisted));
			tempEntry.add(String.valueOf(numDays));
			tempEntry.add(String.valueOf(modeTravel));
			diaryTable.add(tempEntry);
			
			// Exit Logic
			scanner.nextLine();
			while (true) {
				System.out.print("Would you like to Continue (y/n)? ----------: ");
				exitEntry = scanner.nextLine().trim().toLowerCase();
				
				if (exitEntry.equals("y") || exitEntry.equals("n")) {
					System.out.print("\n");
					break;
				} else {
					System.out.println("Incorrect Entry please input (y/n)");
				}
			}
		}
		
		// Print: Invoice Header (Data Labels)
		System.out.println("\n\n" + bannerChar.repeat(150));
		for (int i = 0; i < headerRow.size(); i++) {
			System.out.print(headerRow.get(i) + " -------- ");
		}
		
		System.out.println("\n\n" + bannerChar.repeat(150));
		for (List diaryEntry : diaryTable) {
			List dataList = new ArrayList<>();
			dataList = diaryEntry;
			
			for (int i = 0; i < headerRow.size() && i < dataList.size(); i++) {
				// Get Data
				String headerSelect = headerRow.get(i);
				String dataSelect = String.valueOf(dataList.get(i));
				
				// Solve Padding
				Integer padding = (int) Math.floor((headerSelect.length() - dataSelect.length()) / 2);
				Integer paddingSpace = headerSelect.length() - dataSelect.length();
				Boolean paddingEven = false;
				
				// Solve Padding Even
				if (paddingSpace % 2 == 0) {
					paddingEven = true;
				} else if (paddingSpace % 2 != 0) {
					paddingEven = false;
				}
				
				// Print Data
				if (paddingEven) {
					// Even Padding no correction
					System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "          ");
				} else {
					// Odd Padding with correction
					System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "           ");
				}
			}
			System.out.print("\n");
		}

	}

}
