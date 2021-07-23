import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		double price = 0.00;
		double pay = 0.00;
		
		
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

			int counter = 0;
			float change = (float) (pay - price);
			
			while (change >= 20) {
					change -= 20;
					counter++;
		}
			System.out.println(counter + " twenty dollar bill ");
			counter = 0;
				
			while (change >= 10) { 
					change -= 10;
					counter ++;
		}
			System.out.println(counter + " ten dollar bill");
			counter = 0;
			
			while (change >= 5) {
					change -= 5;
					counter ++;
		}
			System.out.println(counter + " five dollar bill ");
			counter = 0;
			
			while (change >= 1) {
				change -= 1;
				counter ++;
		}
			System.out.println(counter + " one dollar bill ");
			counter = 0;
		
			while (change >= .25) {
				change -= .25;
				counter ++;
		}
			System.out.println(counter + " quarters ");
			counter = 0;
			
			while (change >= .10) {
				change -= .10;
				counter ++;
		}
			System.out.println(counter + " dimes ");
			counter = 0;
			
			while (change >= .05) {
				change -= .05;
				counter ++;
		}
			System.out.println(counter + " nickels ");
			counter = 0;
			
			while (change >= .01) {
				change -= .01;
				counter ++;
		}
			System.out.println(counter + " pennies ");
			counter = 0;
			
			
		
		}

			kb.close();
	
		}

}
