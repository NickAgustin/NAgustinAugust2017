package textExcel;

public class ValueCell extends RealCell {
	
	public double value;
	
	public ValueCell (double value){
		this.value = value;
	}
	
	public String abbreviatedCellText() {
		String truncated = "" + value;
		if(truncated.contains(".")) {
			if(truncated.length() > 10) {
				truncated = truncated.substring(0,10);
			}
			else {
				for(int i = 0; truncated.length() < 10; i++) {
					truncated += " ";
				}	
			}
		}
		else {
			truncated = truncated + ".0";
		}
		return truncated;
	}
	
	public double getDouble() {
		return 0;
	}
	
}
