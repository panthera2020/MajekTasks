//Question 5

/*PSUEDOCODE
1 Input distance travelled
2 input time in hours and minutes
3 Calculate average speed
4 print rest
*/

import java.util.Scanner;

	public class AverageSpeed{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter distance(km): ");
			double distance = input.nextDouble();

			System.out.println("Enter time(Hours): ");
			double hours = input.nextDouble();

			System.out.println("Enter time(minutes): ");
			double minutes = input.nextDouble();

			double timeInHours = hours + (minutes / 60 );
			double averageSpeed = distance / timeInHours;

			System.out.printf("Average Speed: %.2f%n", averageSpeed);
		}
	}

