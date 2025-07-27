// Enrique Simon CIS406 Order Entry Phase 1

package orderEntryPhase1;
import java.util.Scanner;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String testChar = "";
		boolean testValid = false;
		while (!testValid) {
			System.out.print("Enter some Data: ");
			testChar = scanner.nextLine();
			if (testChar != null && !testChar.isEmpty()) {
				System.out.print("Valid");
				testValid = true;
			} else {
				System.out.print("Invalid");
			}
			
		}

	}

}
