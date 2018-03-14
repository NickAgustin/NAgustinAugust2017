package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private static int numberOfRows = 20;
	private static int numberOfColumns = 12;
	private String command = "";
	static Cell [][] spreadsheet = new Cell[numberOfRows][numberOfColumns];

	public Spreadsheet() {
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns ; j++) {
				spreadsheet [i][j] = new EmptyCell();
			}
		}
	}

	public String processCommand(String command){
		if(command.length() <= 3) {
			SpreadsheetLocation contents = new SpreadsheetLocation(command);
			Cell print = getCell(contents);
			return print.fullCellText();
		}
		if(command.contains("=")){
			String Location = command.substring(0, (command.indexOf("=") - 1));
			SpreadsheetLocation cell = new SpreadsheetLocation(command);
			Cell input = new TextCell(command.substring(command.indexOf("=") + 2, command.length() - 1));
			spreadsheet[cell.getRow()][cell.getCol()] = input;
			return getGridText();
		}
		if(command.contains("clear")) {
			if(command.length() < 6) {
				for(int i = 0; i < numberOfRows; i++) {
					for(int j = 0; j < numberOfColumns ; j++) {
						spreadsheet [i][j] = new EmptyCell();
					}
				}
			}
			else {
				SpreadsheetLocation clear = new SpreadsheetLocation(command.substring(command.lastIndexOf("clear") + 2, command.length() - 1));
				spreadsheet[clear.getRow()][clear.getCol()] = new EmptyCell();
			}
		}
		
		if(command == "quit") {
			return "Done";
		}
		return command;
	}

	public int getRows(){
		return numberOfRows;
	}

	public int getCols(){
		return numberOfColumns;
	}

	public Cell getCell(Location loc){
		return spreadsheet[loc.getRow()][loc.getCol()];
	}
	
	public String getGridText(){
		String grid = "";
		char charCounter = 'A';
		int rowCounter = 1;
		for(int row = 0; row < 23; row++) {
			for(int column = 0; column < 13; column++) {
				if(row == 0) {
					if(column == 0) {
						grid += "   |";
					}
					else{
						grid += ""+ charCounter + "         |";
						charCounter++;
					}
				}
				if(0 < row && row < 10){
					if(column == 0) {
						grid += "" + rowCounter + "  |";
						rowCounter++;
					}
					else{
						grid += "          |";
					}
				}
				if(9 < row && row < 21){
					if(column == 0) {
						grid += "" + rowCounter + " |";
						rowCounter++;
					}
					else{
						grid += "          |";
					}
				}
			}
			grid += "\n";
		}
		return grid;
	}

}