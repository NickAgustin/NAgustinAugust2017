package textExcel;

public class TextCell implements Cell{
	
	private String text;
	
	public TextCell(String text) {
		this.text = text;
	}
	
	public String abbreviatedCellText() {
		String abbreviatedText = text.split("\"",3)[1];
		if(abbreviatedText.length() > 10) {
				abbreviatedText = abbreviatedText.substring(0,10);
		}
		else {
			for(int i = 0; abbreviatedText.length() < 10; i++) {
				abbreviatedText += " ";
			}
		}
		return abbreviatedText;
	}

	public String fullCellText() {
		return text;
	}
}
