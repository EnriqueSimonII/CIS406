// Enrique J Simon II CIS406 Order Entry Phase 1

package orderEntryPhase1;
import java.util.Scanner;

public class OrderEntryPhase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		
		// ---------- Data Collection ----------
		// Item Number
		String itemNum = "";
		boolean itemNum_Valid = false;
		while (!itemNum_Valid) {
			System.out.print("Enter item number (alphanumerical) ---------: ");
			itemNum = scanner.nextLine();
			if (itemNum != null && !itemNum.isEmpty()) {
				//System.out.print("Valid");
				itemNum_Valid = true;
			} else {
				System.out.print("\nInvalid Entry try again!!\n");
			}
			
		}
		
		// Item Description
		String itemDescription = "";
		boolean itemD_Valid = false;
		while (!itemD_Valid) {
			System.out.print("Enter item description (alphanumerical) ----: ");
			itemDescription = scanner.nextLine();
			if (itemDescription != null && !itemDescription.isEmpty()) {
				//System.out.print("Valid");
				itemD_Valid = true;
			} else {
				System.out.print("\n!!Invalid Entry try again!!\n");
			}
			
		}
		
		// Item Price
		float itemPrice = 0.0f;
		boolean itemP_Valid = false;
		while (!itemP_Valid) {
			try {
				System.out.print("Enter item price (decimal) -----------------: ");
				itemPrice = scanner.nextFloat();
				if (itemPrice >= Float.MIN_VALUE && itemPrice <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					itemP_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		
		// Item Quantity
		int itemQuantity = 0;
		boolean itemQ_Valid = false;
		while (!itemQ_Valid) {
			try {
				System.out.print("Enter quantity ordered (integer) -----------: ");
				itemQuantity = scanner.nextInt();
				if (itemQuantity >= Integer.MIN_VALUE && itemQuantity <= Integer.MAX_VALUE) {
					//System.out.print("Valid");
					itemQ_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		
		// Tax Paid
		float itemTax = 0.0f;
		boolean itemT_Valid = false;
		while (!itemT_Valid) {
			try {
				System.out.print("Enter total tax paid (decimal NO %) --------: ");
				itemTax = scanner.nextFloat();
				if (itemTax >= Float.MIN_VALUE && itemTax <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					itemT_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		
		// Discount Applied
		float itemDiscount = 0.0f;
		boolean itemDis_Valid = false;
		while (!itemDis_Valid) {
			try {
				System.out.print("Enter total discount (decimal) -------------: ");
				itemDiscount = scanner.nextFloat();
				if (itemDiscount >= Float.MIN_VALUE && itemDiscount <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					itemDis_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		
		// Net Amount Paid
		float itemNet = 0.0f;
		boolean itemN_Valid = false;
		while (!itemN_Valid) {
			try {
				System.out.print("Enter net amount paid (decmial) ------------: ");
				itemNet = scanner.nextFloat();
				if (itemNet >= Float.MIN_VALUE && itemNet <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					itemN_Valid = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}

		// Print Invoice
		System.out.print("\n--------------------------------------------------\n");
		System.out.print("Invoice for Purchase: " + itemNum + "\n\n");
		System.out.println("Item Number --------------: " + itemNum);
		System.out.println("Item Description ---------: " + itemDescription);
		System.out.println("Item Price ---------------: $" + itemPrice);
		System.out.println("Quantity Ordered ---------: " + itemQuantity);
		System.out.println("Tax Paid -----------------: $" + itemTax);
		System.out.println("Discount Applied ---------: $" + itemDiscount);
		System.out.println("Net Amount Paid ----------: $" + itemNet);
		System.out.print("\n--------------------------------------------------\n");
		
		
		
		
		/*
		// String Validation Loop
		String dataEntry = "";
		boolean validator = false;
		while (!validator) {
			System.out.print("--> REPLACE WITH DATA QUESTION <--");
			dataEntry = scanner.nextLine();
			if (dataEntry != null && !dataEntry.isEmpty()) {
				//System.out.print("Valid");
				validator = true;
			} else {
				System.out.print("\n!!Invalid Entry try again!!\n");
			}
			
		}
		
		// Float Validation Loop
		float dataEntry1 = 0.0f;
		boolean validator1 = false;
		while (!validator1) {
			try {
				System.out.print("--> REPLACE WITH DATA QUESTION <--");
				dataEntry1 = scanner.nextFloat();
				if (dataEntry1 >= Float.MIN_VALUE && dataEntry1 <= Float.MAX_VALUE) {
					//System.out.print("Valid");
					validator1 = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}
		
		// Integer Validation Loop
		int dataEntry2 = 0;
		boolean validator2 = false;
		while (!validator2) {
			try {
				System.out.print("--> REPLACE WITH DATA QUESTION <--");
				dataEntry2 = scanner.nextInt();
				if (dataEntry2 >= Integer.MIN_VALUE && dataEntry2 <= Integer.MAX_VALUE) {
					//System.out.print("Valid");
					validator2 = true;
				} else {
					System.out.print("\n!!Invalid Entry try again!!\n");
				}
			} catch (Exception e) {
				System.out.print("\n!!Invalid Entry try again!!\n");
				scanner.next();
			}
		}

	*/
	}

}
