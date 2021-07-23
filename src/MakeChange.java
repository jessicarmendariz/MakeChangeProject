import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double change = 0.00;
		double price = 0.00;
		double pay = 0.00;
		change = pay - price;
		int counter = 0;
	
		
		System.out.println("What is the price of the item?: ");
		price = kb.nextDouble();
		
		System.out.println("How much money did the customer pay?: ");
		pay = kb.nextDouble();
	
		if (pay < price) {
			System.err.println("Insufficient Funds.");
		}
		
		if  (pay == price) {
			System.out.println("Exact Amount. Thank you for shopping!");
		}
	
		
		
		if  (pay > price) {
			System.out.println(change);
			
			
			
			
			
			System.out.println("...still working...");
		
		
		
		}
		
		
		
		
		kb.close();
	}

}
