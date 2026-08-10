/* Question 15
1 collect input in miles
2 convert miles to kilometers using the formula miles * 1.60934
3 print the result in kilometers
*/
import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in miles: ");
        double miles = input.nextDouble();

        double kilometers = miles * 1.60934;

        System.out.println(miles + " miles is " + kilometers + " kilometers.");
    }
}
