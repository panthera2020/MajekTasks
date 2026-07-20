/* Question 2
collect three scores 
use and if statment to only collect inputs between 0 and 100
use loop to collect tha input three times
use if statement to check if grade falls between A, B, C, D, F
initialize sum, then add each of the scores to get the total sum
divide the sum by three to get the average
Display average
*/

import java.util.Scanner; 

public class GradeAndAverage {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		int sum = 0;

		System.out.print("Get the grade of Three Scores");
		System.out.println();

		for(int count = 1; count <= 3; count++){
			System.out.print("Enter Score: ");
			int userScore = input.nextInt();

			if(userScore > 0 && userScore <= 100){
				if(userScore >= 90 && userScore <= 100){
					System.out.println("Grade is A");
				}
				if(userScore >= 80 && userScore < 90){
					System.out.println("Grade is B");
				}
				if(userScore >= 70 && userScore < 80){
					System.out.println("Grade is B");
				}
				if(userScore >= 60 && userScore < 70){
					System.out.println("Grade is B");
				}
				if(userScore < 60){
					System.out.println("Garde is F");
				}
			}else{
				System.out.print("Invalid Input!!!");
				System.out.exit(0);
			}

		sum += userScore;
		}

		int average = sum / 3;
		System.out.println();
		System.out.println("Average: " + average);
	}
}