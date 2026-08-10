/* Question 16
1 collect first integer
2 collect second integer
3 print the integers before swapping
4 create a temporary variable to hold the value of the first integer
5 swap the values
6 print the integers after swapping

*/
import java.util.Scanner;

public class SwapIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = input.nextInt();

        System.out.println("Before swapping:");
        System.out.println("First integer: " + firstInteger);
        System.out.println("Second integer: " + secondInteger);

        int swapContainer = 0; 
        
        swapContainer = firstInteger;
        firstInteger = secondInteger;
        secondInteger = swapContainer;

        System.out.println("After swapping:");
        System.out.println("First integer: " + firstInteger);
        System.out.println("Second integer: " + secondInteger);
    }
}
