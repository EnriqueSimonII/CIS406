// Enrique J Simon II CIS406 Grade Converter

package gradeConverter;
import java.util.Scanner;

public class GradeConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String cont_loop = "y";
		
		System.out.println("Welcome to the letter grade converter\n");
		while (cont_loop.equalsIgnoreCase("y")) {

			System.out.print("Enter numerical grade: ");
			Integer num_grade = scanner.nextInt();
			scanner.nextLine();
			
			if (num_grade >= 90) {
				System.out.println("Letter grade: A");
				
			} else if (num_grade >= 80) {
				System.out.println("Letter grade: B");
				
			} else if (num_grade >= 70) {
				System.out.println("Letter grade: C");
				
			} else if (num_grade >= 60) {
				System.out.println("Letter grade: D");
				
			} else {
				System.out.println("Letter grade: F");
			}
			
			System.out.print("Continue? (y/n): ");
			cont_loop = scanner.next().trim();
			
			if (cont_loop.equalsIgnoreCase("n")) {
				System.out.println("Bye!!");
				break;
			}
		}
		scanner.close();
	}

}
