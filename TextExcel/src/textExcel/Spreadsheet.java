package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private static int numberOfRows = 20;
	private static int numberOfColumns = 12;
	private String printCommand = "";
	static Cell [][] spreadsheet = new Cell[numberOfRows][numberOfColumns];

	public Spreadsheet() {
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; j < numberOfColumns ; j++) {
				spreadsheet [i][j] = new EmptyCell();
			}
		}
	}
	public String processCommand(String command){
		if(command == "quit") {
			printCommand = "quit";
		}
		else {
			if(command.length() <= 3 && command.length() != 0) {
				command.toUpperCase();
				SpreadsheetLocation contents = new SpreadsheetLocation(command);
				Cell print = getCell(contents);
				printCommand = print.fullCellText();
			}
			else {
				if(command.contains("=")){
					String[] components = command.split(" ", 3);
					SpreadsheetLocation cell = new SpreadsheetLocation(components[0].toUpperCase());
					String withQuotes = components[2].substring(0, components[2].length());
					if(components[2].contains("\"")) {
						String[] withoutQuotes = withQuotes.split("\"", 3);
						TextCell create = new TextCell("\"" + withoutQuotes[1]);
						spreadsheet[cell.getRow()][cell.getCol()] = create;
						printCommand = this.getGridText();
					}
					else {
						TextCell create = new TextCell(withQuotes);
						spreadsheet[cell.getRow()][cell.getCol()] = create;
						printCommand = this.getGridText();
					}
				}
				if(command.toLowerCase().contains("clear")) {
					if(command.length() < 6) {
						for(int i = 0; i < numberOfRows; i++) {
							for(int j = 0; j < numberOfColumns ; j++) {
								spreadsheet [i][j] = new EmptyCell();
								printCommand = this.getGridText();
							}
						}
					}
					else {
						SpreadsheetLocation clear = new SpreadsheetLocation(command.substring(6, command.length()));
						spreadsheet[clear.getRow()][clear.getCol()] = new EmptyCell();
						printCommand = this.getGridText();
					}
				}
			}
		}
		return printCommand;
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
		char columnCount = 'A';
		for(int row = 0; row < 21; row++) {
			for(int column = 0; column < 13; column++) {
				if(row == 0) {
					if(column == 0) {
						grid += "   |";
					}
					else {
					grid += "" + columnCount + "         |";
					columnCount++;	
					}
				}
				else {
					if (column == 0) {
						if(row < 10) {
							grid += "" + row + "  |";
						}
						else {
							grid += "" + row + " |";
						}
						
					}
					else {
						String test = spreadsheet[row - 1][column - 1].abbreviatedCellText();
						grid += test + "|";
					}
			}
		}
			
		grid += "\n";
	}
	return grid;
	}
}	