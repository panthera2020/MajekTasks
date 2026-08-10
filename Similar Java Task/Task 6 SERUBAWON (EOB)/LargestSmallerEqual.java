/* Question 27
1 collect two integers
2 initialize variable for largest and smallest
3 if the first integer is greater than the second integer, print the first integer is largest and the second integer is smallest    
4 if the first integer is smaller than the second integer, print the second integer is largest and the first integer is smallest
5 if the first integer is equal to the second integer, print both integers are equal 
*/
import java.util.Scanner;

public class LargestSmallerEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = input.nextInt();

        if (firstInteger > secondInteger) {
            System.out.printf("Largest: %d%nSmallest: %d%n", firstInteger, secondInteger);
        } else if (firstInteger < secondInteger) {
            System.out.printf("Largest: %d%nSmallest: %d%n", secondInteger, firstInteger);
        } else {
            System.out.println("Both integers are equal.");
        }
    }
}
