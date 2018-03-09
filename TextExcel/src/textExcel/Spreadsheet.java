package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{

	private int numberOfRows = 20;
	private int numberOfColumns = 12;
	private String command = "";
	private static Cell [][] spreadsheet = new Cell[20][12];

	public Spreadsheet() {
		for(int i = 0; i < numberOfRows; i++) {
			for(int j = 0; i < numberOfColumns; j++) {
				spreadsheet [i][j] = new EmptyCell();
			}
		}
	}

	public String processCommand(String command){
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
		return null;
	}
	
	public String getGridText(){
		return null;
	}

}