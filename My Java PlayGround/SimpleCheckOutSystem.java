import java.util.Scanner;

public class SimpleCheckOutSystem {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		String[] product = new String[100];
		double price [] = new double[100];

		System.out.print("Enter product name or type 'done' to finish: ");
		product[0] = input.nextLine();

		System.out.println();

		System.out.print("Enter price for " + product[0] + ": "); 
		price[0] = input.nextDouble();

		input.nextLine();

		int counter = 1;
		double sum = price[0];

		while(true){
			System.out.print("Enter product name or type 'done' to finish: ");
			product[counter] = input.nextLine();

			System.out.println();

			System.out.print("Enter price for " + product[counter] + ": "); 
			price[counter] = input.nextDouble();

			input.nextLine();

			sum += price[counter];

			if(product[counter].equalsIgnoreCase("done")){
				break;
			}

		counter++;
		}

		double vat = sum * 0.075;
		double totalAmount = sum + vat;

		System.out.println();

		System.out.println("----------INVOICE-----------");
		for(int count = 0; count < counter; count++){
			System.out.printf("%d  %s  #%.2f%n",(count + 1), product[count], price[count]);
		}

		System.out.println();
		System.out.printf("Subtotal: #%.2f%n", sum);
		System.out.printf("VAT(7.5%%): #%.2f%n", vat);
		System.out.printf("Total Amount: #%.2f%n", totalAmount);

		System.out.println();
		System.out.print("Enter payment amount: ");
		double paymentAmount = input.nextDouble();

		while(paymentAmount < totalAmount){
			System.out.print("Enter payment amount: ");
			paymentAmount = input.nextDouble();
		}

		double balance = paymentAmount - totalAmount;

		System.out.println();
		System.out.println("---------PAYMENT RECEIPT--------");
		for(int count = 0; count < counter; count++){
			System.out.printf("%d  %s  #%.2f%n",(count + 1), product[count], price[count]);
		}

		System.out.println();
		System.out.printf("Total Paid: #%.2f%n", paymentAmount);
		System.out.printf("Grand Total: #%.2f%n", totalAmount);
		System.out.printf("Balance : #%.2f%n", balance);

		System.out.println();
		System.out.println("Payment successful!");
		System.out.println("Thank You for shopping.");
	}
}