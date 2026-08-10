/* Question 52
1 Using the sentinel value 0 keep colleccting input
2 initailize sum to zero
3 keep adding to sum for each iteration until zero is inputed to stop loop
*/
import java.util.Scanner;

public class LoopStopsAtZero {
  public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int number = 0;

        System.out.print("Enter number: ");
        number = input.nextInt();

        while(number != 0){
            sum += number;

            System.out.print("Enter number: ");
            number = input.nextInt();
        }

        System.out.print("Sum: " + sum);
  }  
}
