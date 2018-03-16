package textExcel;

public class TextCell implements Cell{
	
	private String text;
	
	public TextCell(String text) {
		this.text = text;
	}
	
	public String abbreviatedCellText() {
		String abbreviatedText = "";
		if(text.length() > 10) {
			abbreviatedText = text.substring(1,11);
		}
		return abbreviatedText;
	}

	public String fullCellText() {
		return text + "\"";
	}
}
