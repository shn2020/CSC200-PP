
public class PrintJob {
	//instance variables
	private String name;
	private String text;
	private int numberOfSheet;
	private String color;
	
	//default constructor
	public PrintJob() {
		name = "no name yet";
		text = "no text yet";
		numberOfSheet = 0;
		color = "no color yet";
	}
	
	// overloaded constructor
	public PrintJob(String name, String text, int numberOfSheet, String color) throws Exception {
		this.name = name;
		this.text = text;
		setNumberOfSheet(numberOfSheet);
		setColor(color);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setNumberOfSheet(int numberOfSheet) throws LessThanOneException {
		if (numberOfSheet < 1) {
			throw new LessThanOneException("Number of Sheet can not less than one");
		}
		else {
			this.numberOfSheet = numberOfSheet;	
		}
	}
	
	public int getNumberOfSheet() {
		return numberOfSheet;
	}
	
	public void setColor(String color) throws ColorPaperException {
		if (!color.equalsIgnoreCase("yellow") && !color.equalsIgnoreCase("white")) {
			throw new ColorPaperException("Paper color can only be white or yellow");
		}
		else {
			this.color = color;
		}
	}
	
	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "Name: " + name +
				"\nText: " + text + 
				"\nNumber of sheet: " + numberOfSheet +
				"\nColor: " + color;
	}
}
