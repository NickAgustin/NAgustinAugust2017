package textExcel;

public class RealCell implements Cell {

	protected String initialValue;
	
	public String abbreviatedCellText() {
		return null;
	}
	
	public String fullCellText() {
		return initialValue;
	}
	
	public double getDouble() {
		return 0;
	}

}
