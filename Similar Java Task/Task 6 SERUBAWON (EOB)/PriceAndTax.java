/* Question 7
1 Collect price as a double
2 calculate tax, price * 0.075
3 calculate total, price + tax
4 print total.
*/


import java.util.Scanner;

public class PriceAndTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price: ");
        double price = input.nextDouble();

        double tax = price * 0.075;
        double total = price + tax;

        System.out.println("Total: " + total);
    }
}
