package Question2;

import java.util.Scanner;
import java.util.function.Consumer;

public class Order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the order value :");
		Integer a= sc.nextInt();
		
		
		Consumer<Integer> action = b-> {
			if (a>1000) {
				System.out.println("Accepted");}
			else
				{System.out.println("Rejected");}
				
		};
	action.accept(a);
	}
}