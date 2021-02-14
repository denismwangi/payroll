package payrollSystem;

import java.util.Scanner;

public class Payroll {
	
	public static void main(String [] args) {
		
		
		Scanner keyboard = new Scanner(System.in);
		
		mainMenu(keyboard);
	}
	
	public static void mainMenu(Scanner keyboard)
	{
		boolean exit = false;
		int userSelection;
		
		do
		{
			// Displays menu
			System.out.println("===================");
			System.out.println("=    MAIN MENU    =");
			System.out.println("===================\n");
			System.out.println("[1] Input employee information");
			System.out.println("[2] View employee information");
			System.out.println("[3] Exit");
			System.out.print("Your selection: ");
			
			// Gets user input
			userSelection = keyboard.nextInt();
			Employee emp = new Employee();
			
			switch (userSelection)
			{
				case 1:
				{
					emp.calculateWage(0, 0, 0, 0, 0);
					break;
				}

				case 2:
				{
					emp.displayData();
					break;
				}

				case 3:
				{
					exit = true;
					break;
				}

				default:
				{
					System.out.println("\nInvalid input!\n");
					break;
				}
			}
		} while (!exit);
	}
	
	
}


