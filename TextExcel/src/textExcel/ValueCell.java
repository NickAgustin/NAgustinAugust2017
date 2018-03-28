package textExcel;

public class ValueCell extends RealCell {
	
	private String value;
	
	public ValueCell (String value){
		this.value = value;
	}
	
	public String abbreviatedCellText() {
		String truncated = "" + value;
		boolean endsInZero = false;
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
			truncated += ".0";
			for(int i = 0; truncated.length() < 10; i++) {
				truncated += " ";
			}
		}
		return truncated;
	}
	
	public double getDouble() {
		return 0;
	}
}
