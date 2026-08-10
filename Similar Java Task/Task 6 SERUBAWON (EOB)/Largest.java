/* Question 33
1 Collect three integer inputs from the user
2 intialize a variable to hold the largest number
3 Declare first number as largest by defualt
4 Compare the first number with the second number, if the second number is greater than the first number, assign the second number to largest
5 Compare the largest number with the third number, if the third number is greater than the largest number, assign the third number to largest
6 Print the largest number 
*/
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = input.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdInteger = input.nextInt();

        int largest = firstInteger;

        if (secondInteger > largest) {
            largest = secondInteger;
        }

        if (thirdInteger > largest) {
            largest = thirdInteger;
        }

        System.out.printf("The largest number is: %d%n", largest);
    }
}
