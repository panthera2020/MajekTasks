/* Question 48
1 Keep asking for positive integers till and only stops when a negative input is added
*/

import java.util.Scanner;

public class PositiveDoWhile {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int number = 0;

        do{
            System.out.println("Enter Positive integers: ");
            number = input.nextInt();
        }while(number > 0);
    }
}
