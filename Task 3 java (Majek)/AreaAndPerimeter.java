//Question 4

/*PSUEDOCODE
1 Input all sides of the triangle
2 calculate area and perimeter
3 Print answer
*/

import java.util.Scanner;

	public class AreaAndPerimeter{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter height: ");
			double height = input.nextDouble();

			System.out.println("Enter side a: ");
			double a = input.nextDouble();

			System.out.println("Enter side b: ");
			double b = input.nextDouble();

			double area = (height * b) / 2.0;
			double perimeter = a + b + (Math.pow((a*a) + (b*b), (1.0/2.0)));

			System.out.printf("Area: %.2f%nPerimeter: %.2f%n", area, perimeter);
			
			
		}
	}