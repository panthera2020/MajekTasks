/* Question 29
1 collect username and password from user
2 check if username is "admin" and password is "1234", print "Access Granted"
3 if username is not "admin" or password is not "1234", print "Access Denied" 
*/
import java.util.Scanner;

public class GrantAccess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = input.nextLine();

        System.out.print("Enter password: ");
        int password = input.nextInt();

        String correctUsername = "admin";
        int correctPassword = 1234;

        if (username.equals(correctUsername) && password == correctPassword) {
            System.out.println("Access Granted");
        } else {
            System.out.println("Access Denied");
        }
    }
}
