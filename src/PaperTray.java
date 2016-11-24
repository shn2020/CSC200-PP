
public class PaperTray {
	//instance variables
	private String name;
	private String color;
	private int numberOfPaper;
	
	//constant
	private final int maxPaper = 100;
	
	//default constructor
	public PaperTray() {
		name = "no name yet";
		color = "no color yet";
		numberOfPaper = 0;
	}
	
	//overloaded constructor
	public PaperTray(String name, String color, int numberOfPaper) {
		this.name = name;
		this.color = color;
		this.numberOfPaper = numberOfPaper;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setNumberOfPaper(int numberOfPaper) {
		this.numberOfPaper = numberOfPaper;
	}
	
	public int getNumberOfPaper() {
		return numberOfPaper;
	}
	
	public void addPaper(int addedPaper) throws PaperOverFlowException {
		if (numberOfPaper + addedPaper > maxPaper) {
			throw new PaperOverFlowException("The total paper in the tray can not be than 100");
		}
		else {
			numberOfPaper = numberOfPaper + addedPaper;
		}
	}
	
	@Override
	public String toString() {
		return "Name: " + name +
				"\nColor of paper: " + color + 
				"\nNumber of paper in tray: " + numberOfPaper;
				
	}
	
	
}
