package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args) {
		Spreadsheet MainSpreadSheet = new Spreadsheet();
		System.out.println(MainSpreadSheet.getGridText());
		Scanner userInput  = new Scanner(System.in);
		String test = "";
		while(!(test == "quit")) {
			test = MainSpreadSheet.processCommand(userInput.nextLine());
				System.out.println(test);
		}
	}
}
