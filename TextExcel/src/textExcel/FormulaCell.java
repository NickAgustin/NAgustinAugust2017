package textExcel;

public class FormulaCell extends RealCell{
private String value;
	
	public FormulaCell (String value){
		this.value = value;
	}
	
	public String abbreviatedCellText() {
		String truncated = "" + value;
		boolean endsInZero = false;
		if(truncated.contains(".")) {
			String percentWhole = truncated.substring(0, truncated.indexOf("."));
			if(truncated.length() > 10) {
				truncated = truncated.substring(0, 9) + "%";
			}
			else {
				truncated += "%";
				for(int i = 0; truncated.length() < 10; i++) {
					truncated += " ";
				}	
			}
		}
		else {
			truncated += "%";
			for(int i = 0; truncated.length() < 10; i++) {
				truncated += " ";
			}
		}
		return "Hi";
	}
	
	public double getDouble() {
		return 0;
	}
}
