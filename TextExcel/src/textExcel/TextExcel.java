package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args) {
		TextCell hifa = new TextCell("\"abcdefghi\"");
		System.out.println(hifa.fullCellText());
		System.out.println(hifa.abbreviatedCellText());
		Spreadsheet MainSpreadSheet = new Spreadsheet();
		Scanner userInput  = new Scanner(System.in);
		String test = "";
		while(!(test == "quit")) {
			test = MainSpreadSheet.processCommand(userInput.nextLine());
				System.out.println(test);
		}
	}
}
