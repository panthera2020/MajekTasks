//Question 8

/*PSUEDOCODE
1 Input Height
2 Input weight
3 Calculate bmi
4 Print result
*/


import java.util.Scanner;
	public class BmiCalculator{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Enter weight(kg): ");
       			double weight = input.nextDouble();

        		System.out.print("Enter height(m): ");
        		double height = input.nextDouble();

        		double bmi = weight / (height * height);

			System.out.printf("Your BMI: %.2f", bmi);        
		}
	}

			        
