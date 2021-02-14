package payrollSystem;

import java.util.Scanner;

public class Employee {
	
	
	public int empId;
	public double wage;
	public char workType;
	public String empName;
	public int hourwage;
	public int monthlypay;
	public int biweeklypay;
	public int hourworked;
	
	public int getMonthlypay() {
		return monthlypay;
	}
	public void setMonthlypay(int monthlypay) {
		this.monthlypay = monthlypay;
	}
	public int getBiweeklypay() {
		return biweeklypay;
	}
	public void setBiweeklypay(int biweeklypay) {
		this.biweeklypay = biweeklypay;
	}
	public int getHourwage() {
		return hourwage;
	}
	public void setHourwage(int hourwage) {
		this.hourwage = hourwage;
	}
	public int getHourworked() {
		return hourworked;
	}
	public void setHourworked(int hourworked) {
		this.hourworked = hourworked;
	}
 
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public char getWorkType() {
		return workType;
	}
	public void setWorkType(char workType) {
		this.workType = workType;
	}
	
	public void calculateWage(int taxF, int taxT, int taxC , int benefits , int salary) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("What is employee name");
		empName = keyboard.nextLine();
		 while(!empName.matches("[a-zA-Z_]+")) {
		    System.out.println("Invalid name");
		    System.out.print("What is employee name");
		    empName = keyboard.nextLine();
		}
		
		System.out.print("what is employess Id");
		//empId = keyboard.nextInt();
		String id;
		id = keyboard.nextLine();
		if (!id.matches("[0-9]+")) {
		    System.out.println("Invalid number");
		}
		 System.out.print("enter a valid employee number !!");
		 id = keyboard.nextLine();
		System.out.print("enter work type--- character F, T or C");
		workType = keyboard.next().charAt(0);
		if(workType == 'F' | workType == 'f') {

			System.out.print("what is employee wage");
			monthlypay = keyboard.nextInt();
			while(monthlypay > 30000) {
				System.out.print("mothlypay cannot exceed 30000");

				System.out.print("what is employee wage");
				monthlypay = keyboard.nextInt();
			}
			
			 benefits = (int)(monthlypay * (0.1));
			
			 taxF = (int) (monthlypay * (0.2));
		      salary = (monthlypay -(taxF + benefits));
		      
		      
			System.out.println("------------------------------------------------------------------------");
			System .out.println("employee name, employee id , workType,  Total wage before tax,  Total wage"  );
			System.out.println(empName +"\t\t"+   empId +"\t\t"+  workType +"\t\t"+   monthlypay   +"\t\t"+  salary);
			
			System.out.println();
			System.out.println();
			
			
			
		}
		if(workType == 'T' | workType == 't'){
			
			System.out.println("enter employee hourly wage");
			hourwage = keyboard.nextInt();
			
			while(hourwage > 90){
				System.out.print("hour wage cannot exceed 90.00");
				System.out.println("enter employee hourly wage");
				hourwage = keyboard.nextInt();
				
			}
			taxT = (int)(hourwage * (0.15));
			salary = (hourwage -(taxT));
			
			System.out.println("--------------------------------------------------------------------------");
			System .out.println("employee name, employee id , workType,  Total wage before tax,  Total wage"  );
			System.out.println(empName +"\t\t"+   empId +"\t\t"+  workType +"\t\t"+   hourwage   +"\t\t"+  salary);
			
			
			System.out.println();
			System.out.println();
			
			
			
			
		}
		
		if(workType == 'C' | workType == 'c') {
			
			
				System.out.print("enter employee biweekly Payroll");
				biweeklypay = keyboard.nextInt();
				
			   while((biweeklypay < 1000) && (biweeklypay >3500 )) {
					System.out.println("the bi-weekly Payroll cannot be below 1000.00 or more than 3500.00");
					
					System.out.print("enter employee biweekly Payroll");
					biweeklypay = keyboard.nextInt();
				}
		
			taxC = (int)(biweeklypay * (0.18));
			salary = (biweeklypay - (taxC));
			
			System.out.println("wage before tax" +biweeklypay);
			
			
			System.out.println("--------------------------------------------------------------------------");
			System .out.println("employee name, employee id , workType,  Total wage before tax,  Total wage"  );
			System.out.println(empName +"\t\t"+   empId +"\t\t"+  workType +"\t\t"+   biweeklypay   +"\t\t"+  salary);
			
			
			System.out.println();
			System.out.println();
			
			
			
		}
		
	}
	
	public void displayData() {
		System.out.print("No data found!! please input data");
		System.out.println("------------------------------------------------------------------------");
		System .out.println("employee name, employee id , workType,  Total wage before tax,  Total wage"  );
		
		
		
	}
	
	 
	 

}
