import java.util.Scanner;
public class Pyramid{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Number of Stones: ");
		double n = input.nextDouble();

		System.out.print("Average Weight per Stone: ");
		double w = input.nextDouble();

		System.out.print("Years to Build: ");
		double y = input.nextDouble();

		double totalWeight = n * w ;
		double weightPerYear = totalWeight / y ;
		double weightPerDay = totalWeight / (y * 365);
		double weightPerHours = totalWeight / (y * 365 * 24);
		double weightPerMinutes = totalWeight / (y * 365 * 24 * 60);

		System.out.printf("The weight built per minutes:%f ", weightPerMinutes);
		System.out.printf("The weight built per Hour: %f ", weightPerHours);
		System.out.printf("The weight built per Day: %f ", weightPerDay);
		System.out.printf("The weight built per: %f", weightPerYear);
  }
}