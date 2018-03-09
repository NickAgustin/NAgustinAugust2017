package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{

	private int numberOfRows = 20;
	private int numberOfColumns = 12;
	private int rowNumber;
	private int columnNumber;

	public int getRow(){
		return 0;
	}

	public int getCol(){
		return 0;
	}

	public SpreadsheetLocation(String cellName){
		char rowLetter = cellName.charAt(0);
		int columnNumber = Integer.valueOf(cellName.substring(1 ,  cellName.length() - 1));
		for(char check = 'a'; check < (char) ('a' + numberOfRows); check++) {
			if(rowLetter == check) {
				this.rowNumber = rowLetter - 96;
			}
		}
		for(int check = 0; check < numberOfColumns; check++) {
			if(columnNumber == check) {
				this.columnNumber = columnNumber;
			}
		}
		
	}
}