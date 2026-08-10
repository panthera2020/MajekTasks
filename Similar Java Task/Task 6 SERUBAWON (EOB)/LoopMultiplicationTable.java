/* Question 55
1 Collect input from user
2 Start a loop that counts from 1 to 12
3 mulitiply each iteration by input
4 Print out result for each iteration
*/

import java.util.Scanner;

public class LoopMultiplicationTable {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = input.nextInt();

        int result = 0;

        for(int count = 1; count <= 12; count++){
            result = number * count;
            System.out.print(count + " * " + number + " = "+ result +"\n");
        }
    }
}
