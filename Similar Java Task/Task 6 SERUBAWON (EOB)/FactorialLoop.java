//Question 58
/*
1 collect input from user
2 use a loop to multiply through the iteration and then stop are input.
3 print result
*/

import java.util.Scanner;

public class FactorialLoop {
    public static void main(String[]args){
        Scanner input  = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = input.nextInt();

        int result = 1;

        for(int count = 1; count <= number; count++){
            result = result * count;
        }

        System.out.println("The factorial of " + number + " is " + result);
    }
}
