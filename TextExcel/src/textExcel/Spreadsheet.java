package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private static int numberOfRows = 20;
	private static int numberOfColumns = 12;
	private String printCommand = "";
	static Cell [][] spreadsheet = new Cell[21][13];

	public Spreadsheet() {
		for(int i = 0; i < 21; i++) {
			for(int j = 0; j < 13; j++) {
				spreadsheet [i][j] = new EmptyCell();
			}
		}
	}
	public String processCommand(String command){
		if(command == "quit") {
			printCommand = "quit";
		}
		else {
			if(command.toLowerCase().equals("clear")) {
				if(command.length() < 6) {
					for(int i = 0; i < 21; i++) {
						for(int j = 0; j < 13 ; j++) {
							spreadsheet [i][j] = new EmptyCell();
							printCommand = this.getGridText();
						}
					}
				}
			}
				else {
					if(command.toLowerCase().contains("clear ")) {
						SpreadsheetLocation clear = new SpreadsheetLocation(command.substring(6, command.length()));
						spreadsheet[clear.getRow() + 1][clear.getCol() + 1] = new EmptyCell();
						printCommand = this.getGridText();
				}
					else{
						if(command.length() <= 3 && command.length() != 0) {
						command.toUpperCase();
						SpreadsheetLocation contents = new SpreadsheetLocation(command);
						Cell print = getCell(contents);
						printCommand = print.fullCellText();
					}
						else {
							if(command.contains("=")){
								String[] components = command.split(" ", 3);
								components[0].toUpperCase();
								SpreadsheetLocation cell = new SpreadsheetLocation(components[0]);
								TextCell create = new TextCell(components[2].substring(0, components[2].length()));
								spreadsheet[cell.getRow() + 1][cell.getCol() + 1] = create;
								System.out.println(cell.getRow() + " + " + cell.getCol());
								printCommand = this.getGridText();
							}
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
		return spreadsheet[loc.getRow() + 1][loc.getCol() + 1];
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
						String test = spreadsheet[row][column].abbreviatedCellText();
						grid += test + "|";
					}
			}
		}
			
		grid += "\n";
	}
	return grid;
	}
}	