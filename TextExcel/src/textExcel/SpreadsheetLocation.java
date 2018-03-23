package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location{

	private int numberOfRows = 20;
	private int numberOfColumns = 12;
	private int rowNumber;
	private int columnNumber;
	private String location;

	public int getRow(){
		this.rowNumber = Integer.parseInt(location.substring(1, location.length()));
		return rowNumber - 1;
	}

	public int getCol(){
		this.columnNumber = location.charAt(0);
		return columnNumber - 65;
	}

	public SpreadsheetLocation(String cellName){
		location = cellName.toUpperCase();
	}
}