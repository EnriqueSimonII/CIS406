// Enrique J Simon II CIS406 Order Entry Phase 3

package orderEntryPhase3;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.text.DecimalFormat;

public class OrderEntryPhase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Elements
		Scanner scanner = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		String exitEntry = "y";
		
		// Storage
		List<List> masterJournal = new ArrayList<>();
		List totalsEntry = new ArrayList<>(Arrays.asList("Totals", 0, "--", "--", "--", 0.0f, 0.0f, "--", 0.0f, 0.0f));
		
		// Enter Records Loop
		while (exitEntry.equals("y")) {
			
			// ---------- Data Collection ----------
			// Enter: Item Number
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
			
			// Enter: Item Description
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
			
			// Enter: Item Price
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
			
			// Enter: Item Quantity
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
			
			// Enter: Tax Paid Percentage
			float itemTax = 0.0f;
			boolean itemT_Valid = false;
			while (!itemT_Valid) {
				try {
					System.out.print("Enter total tax rate (decimal NO %) --------: ");
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
			
			// Enter: Discount Percentage
			float itemDiscount = 0.0f;
			boolean itemDis_Valid = false;
			while (!itemDis_Valid) {
				try {
					System.out.print("Enter total discount % (decimal) -----------: ");
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

			// Calculate: Record Values
			float grsAmt = itemPrice * itemQuantity;
			float taxAmt = (grsAmt * itemTax) / 100;
			grsAmt += taxAmt;
			float disAmt = (grsAmt * itemDiscount) / 100;
			float netAmt = grsAmt - disAmt;
			
			// Append List: Records Data
			List dataList_Temp = new ArrayList();
			dataList_Temp.add(itemNum);
			dataList_Temp.add(itemDescription);
			dataList_Temp.add(itemPrice);
			dataList_Temp.add(itemQuantity);
			dataList_Temp.add(itemTax);
			dataList_Temp.add(df.format(taxAmt));
			dataList_Temp.add(df.format(grsAmt));
			dataList_Temp.add(itemDiscount);
			dataList_Temp.add(df.format(disAmt));
			dataList_Temp.add(df.format(netAmt));
			
			// Format Data: Records
			for (int data = 0; data < dataList_Temp.size(); data++) {
				String dataSelect = String.valueOf(dataList_Temp.get(data));
				if (data == 2 || data == 5 || data == 6 || data == 8 || data == 9) {
					dataList_Temp.set(data, "$" + dataSelect);
				} else if (data == 4 || data == 7) {
					dataList_Temp.set(data, dataSelect + "%");
				}
			}
			
			// Calculate: Total Values
			totalsEntry.set(1, (int)totalsEntry.get(1) + 1);
			totalsEntry.set(5, (float)totalsEntry.get(5) + (float)taxAmt);
			totalsEntry.set(6, (float)totalsEntry.get(6) + (float)grsAmt);
			totalsEntry.set(8, (float)totalsEntry.get(8) + (float)disAmt);
			totalsEntry.set(9, (float)totalsEntry.get(9) + (float)netAmt);
			
			// Append List: Master Journal
			masterJournal.add(dataList_Temp);
			
			// Exit Logic
			while (true) {
				System.out.print("Would you like to Continue (y/n)? ----------: ");
				scanner.nextLine();
				exitEntry = scanner.nextLine().toLowerCase();
				
				if (exitEntry.equals("y") || exitEntry.equals("n")) {
					System.out.print("\n");
					break;
				} else if (!exitEntry.equals("y") || !exitEntry.equals("n")) {
					System.out.println("Incorrect Entry please input (y/n)");
				}
			}
		}
		
		// Append List: Totals
		totalsEntry.set(1, (int)totalsEntry.get(1));
		totalsEntry.set(5, df.format((float)totalsEntry.get(5)));
		totalsEntry.set(6, df.format((float)totalsEntry.get(6)));
		totalsEntry.set(8, df.format((float)totalsEntry.get(8)));
		totalsEntry.set(9, df.format((float)totalsEntry.get(9)));
		
		// Format Data: Totals
		for (int data = 0; data < totalsEntry.size(); data++) {
			String dataSelect = String.valueOf(totalsEntry.get(data));
			if (data == 5 || data == 6 || data == 8 || data == 9) {
				totalsEntry.set(data, "$" + dataSelect);
			} else if (data == 1) {
				totalsEntry.set(data, "# items = " + dataSelect);
			}
		}
		
		// ---------- Labels & Print Data ----------
		// Create: Headers
		List<String> labelList = new ArrayList<>();
		String itemNum_Lab = "Item Number";
		labelList.add(itemNum_Lab);
		String itemDes_Lab = "Item Description";
		labelList.add(itemDes_Lab);
		String itemPri_Lab = "Item Price";
		labelList.add(itemPri_Lab);
		String itemQuan_Lab = "Quantity";
		labelList.add(itemQuan_Lab);
		String itemTaxP_Lab = "Tax Percentage";
		labelList.add(itemTaxP_Lab);
		String itemTaxA_Lab = "Tax Amount";
		labelList.add(itemTaxA_Lab);
		String itemGrsA_Lab= "Gross Amount";
		labelList.add(itemGrsA_Lab);
		String itemDisP_Lab = "Discount Percentage";
		labelList.add(itemDisP_Lab);
		String itemDisA_Lab = "Discount Amount";
		labelList.add(itemDisA_Lab);
		String itemNetA_Lab = "Net Amount";
		labelList.add(itemNetA_Lab);
		
		
		// Create: Table Structure
		String bannerChar = "-";
		Integer bannerLen = (itemNum_Lab.length() + 
						 	 itemDes_Lab.length() +
						 	 itemPri_Lab.length() +
						 	 itemQuan_Lab.length() +
						 	 itemTaxP_Lab.length() +
						 	 itemTaxA_Lab.length() +
						 	 itemGrsA_Lab.length() +
						 	 itemDisP_Lab.length() +
						 	 itemDisA_Lab.length() +
						 	 itemNetA_Lab.length() + 54);
		
		// Print: Invoice Header
		System.out.println(bannerChar.repeat(bannerLen));
		System.out.println(itemNum_Lab + " ---- " + 
						   itemDes_Lab + " ---- " +
						   itemPri_Lab + " ---- " +
						   itemQuan_Lab + " ---- " +
						   itemTaxP_Lab + " ---- " +
						   itemTaxA_Lab + " ---- " +
						   itemGrsA_Lab + " ---- " +
						   itemDisP_Lab + " ---- " +
						   itemDisA_Lab + " ---- " +
						   itemNetA_Lab + " ---- ");
		
		
		// Print: Invoice Data Records
		for (List masterEntry : masterJournal) {
			List dataList = new ArrayList<>();
			dataList = masterEntry;
			
			for (int i = 0; i < labelList.size() && i < dataList.size(); i++) {
				// Get Data
				String headerSelect = labelList.get(i);
				String dataSelect = String.valueOf(dataList.get(i));
				
				// Solve Padding
				Integer padding = (int) Math.floor((headerSelect.length() - dataSelect.length()) / 2);
				Integer paddingSpace = headerSelect.length() - dataSelect.length();
				Boolean paddingEven = false;
				if (paddingSpace % 2 == 0) {
					paddingEven = true;
				} else if (paddingSpace % 2 != 0) {
					paddingEven = false;
				}
				
				// Print Data
				if (paddingEven) {
					// Even Padding no correction
					System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "      ");
				} else {
					// Odd Padding with correction
					System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "       ");
				}
			}
			System.out.print("\n");
		}
		
		// Print: Invoice Data Totals
		System.out.println(bannerChar.repeat(bannerLen));
		for (int i = 0; i < labelList.size() && i < totalsEntry.size(); i++) {
			// Get Data
			String headerSelect = labelList.get(i);
			String dataSelect = String.valueOf(totalsEntry.get(i));
			
			// Solve Padding
			Integer padding = (int) Math.floor((headerSelect.length() - dataSelect.length()) / 2);
			Integer paddingSpace = headerSelect.length() - dataSelect.length();
			Boolean paddingEven = false;
			if (paddingSpace % 2 == 0) {
				paddingEven = true;
			} else if (paddingSpace % 2 != 0) {
				paddingEven = false;
			}
			
			// Print Data
			if (paddingEven) {
				// Even Padding no correction
				System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "      ");
			} else {
				// Odd Padding with correction
				System.out.print(" ".repeat(padding) + dataSelect + " ".repeat(padding) + "       ");
			}
		}
		System.out.print("\n");
	}
}
