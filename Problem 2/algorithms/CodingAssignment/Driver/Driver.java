package algorithms.CodingAssignment.Driver;

import java.util.Scanner;
import algorithms.CodingAssignment.Services.*;

public class Driver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of companies");
		int array_length = sc.nextInt();
		
		double[] stock_price = new double[array_length];
		Boolean[] stock_status = new Boolean[array_length];
		
		for(int i=0; i<array_length; i++) {
			System.out.println("Enter current stock price of the company "+ (int)(i+1));
			stock_price[i] = sc.nextDouble();
			
			System.out.println("Whether company's stock price rose today compare to yesterday?");
			stock_status[i] = sc.nextBoolean();
		}
		
		Services obj = new Services(stock_price, stock_status);
		
		int choose = 0;
		
		do {
		System.out.println("---------------------------------------");
		System.out.println("Enter the operation that you want to perform");
		System.out.println("1. Display the companies stock prices in ascending order");
		System.out.println("2. Display the companies stock prices in descending order");
		System.out.println("3. Display the total no of companies for which stock prices rose today");
		System.out.println("4. Display the total no of companies for which stock prices declined today");
		System.out.println("5. Search a specific stock price");
		System.out.println("6. Press 0 to exit");
		System.out.println("---------------------------------------");
		
		choose = sc.nextInt();
		
		switch(choose){ 
		case 0: 
			System.out.println("Exiting ....");
		 break;
		case 1: 
			System.out.println("Displaying the companies stock prices in ascending order");
			double[] asc_array = obj.getAscending();
			for(int i=0; i<asc_array.length; i++) {
				System.out.print("|"+asc_array[i]+"|");
			}
			System.out.println();
		 break;  
		case 2: 
			System.out.println("Displaying the companies stock prices in descending order");
			double[] desc_array = obj.getDescending();
			for(int i=0; i<desc_array.length; i++) {
				System.out.print("|"+desc_array[i]+"|");
			}
			System.out.println();
		 break;
		case 3:
			System.out.println("Total no of companies whose stock price rose today : "+ obj.getRisedCompanyCount());
		 break;
		case 4: 
			System.out.println("Total no of companies whose stock price decline today : "+ obj.getDeclinedCompanyCount());
		 break;
		case 5: 
			System.out.println("Enter the element");
			double element = sc.nextDouble();
			obj.search(element);
		 break;
		default:     
			System.out.println("OOPS !! Wrong Choice"); 
		}   
		} while(choose>0);
	}
}
