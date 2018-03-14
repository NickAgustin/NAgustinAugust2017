package textExcel;

import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel{

	public static void main(String[] args){
		TestsALL.Helper th = new TestsALL.Helper();
		System.out.println(th.getText());
		
		Spreadsheet gridTest = new Spreadsheet();
		System.out.println(gridTest.getGridText());
		
		Spreadsheet MainSpreadSheet = new Spreadsheet();
		Scanner userInput  = new Scanner(System.in);
		String test = "";
		while(!(test == "quit")) {
			test = MainSpreadSheet.processCommand(userInput.nextLine());
				System.out.println(test);
		}
	}
}
