/* 
1 Collect age of user
2 check if age is less than 13, print child
3 check if age is between 13 and 17, print teenager
4 check if age is between 18 and 64, print adult
5 check if age is 65 or older, print senior
*/

import java.util.Scanner;

public class AgeDifference {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 64) {
            System.out.println("Adult");
        } else if (age >= 65) {
            System.out.println("Senior");
        }
    }
}