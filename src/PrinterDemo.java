import java.util.Scanner;

public class PrinterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Printer myPrinter = new Printer();
		int option;
		
		do {
			System.out.println();
			System.out.println("Enter 1 to process the next request");
			System.out.println("Enter 2 to add a print request");
			System.out.println("Enter 3 to see all print request");
			System.out.println("Enter 4 to see the amount paper in both trays");
			System.out.println("Enter 5 to load more paper into each tray");
			System.out.println("Enter 6 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1) {
				myPrinter.printNext();
			}
			else if (option == 2) {
				PrintJob newPrintJob = new PrintJob();
				System.out.print("Enter the name of the print request: ");
				newPrintJob.setName(keyboard.nextLine());
				
				System.out.print("Enter the text of the print request: ");
				newPrintJob.setText(keyboard.nextLine());
				
				boolean isContinue = true;
				do {
					System.out.print("Enter the color of sheet for print request: ");
					try {
						newPrintJob.setColor(keyboard.nextLine());
						isContinue = false;
					}
					catch (ColorPaperException ex){
						System.out.println(ex.getMessage());
					}
				} while (isContinue);
				
				isContinue = true;
				do {
					System.out.print("Enter the number of sheet for print request: ");
					try {
						newPrintJob.setNumberOfSheet(keyboard.nextInt());
						isContinue = false;
					}
					catch (LessThanOneException ex){
						System.out.println(ex.getMessage());
					}
				} while (isContinue);
				
				myPrinter.addPrintJob(newPrintJob);
			}
			else if (option == 3) {
				myPrinter.displayAllPrintJob();
			}
			else if (option == 4) {
				myPrinter.showAmountOfPaper();
			}
			else if (option == 5) {
				System.out.print("Enter the number of paper to add: ");
				myPrinter.addPaper(keyboard.nextInt());
			}
			else if (option == 6) {
				System.out.println("End of program");
			}
			else {
				System.out.println("Invalid request");
			}
		} while (option != 6);
	}

}
