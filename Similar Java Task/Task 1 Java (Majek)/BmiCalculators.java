 
import java.util.Scanner;
	public class BmiCalculators{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.print("Input weight: ");
        		double weight = input.nextDouble();
        		System.out.print("Input height: ");
        		double height = input.nextDouble();

        		double BMI = weight / (height * height);

        		if(BMI < 18){
           			System.out.print("You are Underweight");
        		}
        		if(BMI >= 18 && BMI <= 24){
            			System.out.print("Normal");
        		}
        		if(BMI >= 25 && BMI <= 29){
            			System.out.print("You are Overweight");
        		}
        		if(BMI >= 30){
            			System.out.print("You are Obese");
        		}

		}
	}