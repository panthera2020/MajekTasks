/* Question 13
1 Collect  item price
2 Collect quantity
3 Calculate subtotal, item price * quantity
4 Calculate VAT, subtotal * 0.2
5 Calculate grand total, subtotal + VAT
6 print grand total
*/
import java.util.Scanner;

public class Vat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = input.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        double subtotal = price * quantity;
        double vat = subtotal * 0.2;
        double grandTotal = subtotal + vat;

        System.out.printf("Grand Total: %.2f%n", grandTotal);
    }
}
