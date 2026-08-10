/* Question 22
1 collect integer input from user
2 check if number is divisible by 2
3 if number is divisible by 2, print Even
4 if number is not divisible by 2, print Odd
*/

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
