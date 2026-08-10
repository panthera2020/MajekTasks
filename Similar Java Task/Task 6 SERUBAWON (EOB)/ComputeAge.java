/*Question 10 
1 Collect person's first name
2 collect person's last name
3 collect year of birth
4 Compute age, current year - year of birth
5 initialize current year as 2025
6 Print a formatted profile: first name, last name, age
*/

import java.util.Scanner;

public class ComputeAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter your year of birth: ");
        int yearOfBirth = input.nextInt();

        int currentYear = 2025;
        int age = currentYear - yearOfBirth;

        System.out.printf("Profile: %s %s%nAge: %d%n", firstName, lastName, age);
    }
}
