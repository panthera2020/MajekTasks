/* Question 42
1 collect a number from the user
2 print divisible by 3 and 5 if the number is divisible by both 3 and 5
3 print divisible by 3 if the number is divisible by 3 only
4 print divisible by 5 if the number is divisible by 5 only
5 else print divsible by neither

*/

import java.util.Scanner;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else if (number % 3 == 0) {
            System.out.println("Divisible by 3 only");
        } else if (number % 5 == 0) {
            System.out.println("Divisible by 5 only");
        } else {
            System.out.println("Divisible by neither");
        }
    }
}
