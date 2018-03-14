package textExcel;

public class TextCell implements Cell{
	
	private String text;
	
	public TextCell(String text) {
		this.text = text;
	}
	
	public String abbreviatedCellText() {
		if(this.text.length() > 10) {
			text = text.substring(0,9);
		}
		return text;
	}

	public String fullCellText() {
		return "\"" + text + "\"";
	}
}
