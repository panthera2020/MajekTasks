/* Question 31
1 Collect input of units used as an integer
2 if unit is between 0 and 100, multiply by 50 and print bill
3 if unit is between 101 and 300, multiply by 75 and print bill
4 if unit is above 300, multiply by 100 and print bill
*/
import java.util.Scanner;

public class UtilityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of units used: ");
        int units = input.nextInt();

        double bill = 0;

        if (units >= 0 && units <= 100) {
            bill = units * 50;
        } else if (units >= 101 && units <= 300) {
            bill = units * 75;
        } else if (units > 300) {
            bill = units * 100;
        }

        System.out.println("The utility bill is: " + bill);
    }
}

