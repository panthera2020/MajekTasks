/* Question 21
1 collect integer input from user
2 check if input is greater than 0
3 if input is greater than 0, print Positive
*/

import java.util.Scanner;

public class PositiveInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        }
    }
}
