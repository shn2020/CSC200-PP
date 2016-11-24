
public class Printer {
	//instance variable
	private LinkedUnbndQueue<PrintJob> allPrintJob;
	private PaperTray whiteTray;
	private PaperTray yellowTray;
	
	private PrintJob processed;
	
	public Printer() {
		allPrintJob = new LinkedUnbndQueue<PrintJob>();
		whiteTray = new PaperTray("White paper tray","white",100);
		yellowTray = new PaperTray("Yellow paper tray","yellow",100);
	}
	
	private boolean canPrint(PaperTray tray) {
		int remainPaper = (tray.getNumberOfPaper() - processed.getNumberOfSheet());
		boolean canPrint = (remainPaper >= 0);
		if (canPrint) 
			tray.setNumberOfPaper(remainPaper);
		return canPrint;
	}
	
	public void printNext() {
		try {
			processed = allPrintJob.dequeue();
			boolean canPrint = false;
			if (processed.getColor().equals("white")) {
				canPrint = canPrint(whiteTray);
			}
			else if (processed.getColor().equals("yellow")) {
				canPrint = canPrint(yellowTray);
			}
			
			if (canPrint) {
				System.out.println(processed.getName() + " was printed");
			}
			else {
				System.out.println("Not enough paper. Please add more");
				System.out.print(processed.getName() + " was not printed and placed at the end of the queue");
				allPrintJob.enqueue(processed);
			}
		}
		catch (QueueUnderFlowException ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	public void addPrintJob(PrintJob newPrintJob) {
		allPrintJob.enqueue(newPrintJob);
	}
	
	public void displayAllPrintJob() {
		System.out.println(allPrintJob.toString());
	}
	
	public void showAmountOfPaper() {
		System.out.println("Amount of white paper: " + whiteTray.getNumberOfPaper());
		System.out.println("Amount of yellow paper: " + yellowTray.getNumberOfPaper());	
	}
	
	public void addPaper(int addedPaper) {
		try {
			whiteTray.addPaper(addedPaper);
			yellowTray.addPaper(addedPaper);
		}
		catch (PaperOverFlowException ex) {
			System.out.println(ex.getMessage());
		}
		
	}
}
