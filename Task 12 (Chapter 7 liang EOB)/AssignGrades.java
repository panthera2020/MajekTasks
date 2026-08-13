import java.util.Scanner;

public class AssignGrades {

	public static int largestIn(int [] anArrayOfScore){
		int largest = anArrayOfScore[0];

		for(int count = 1; count < anArrayOfScore.length; count++){
			if(anArrayOfScore[count] > largest){
				largest = anArrayOfScore[count];
			}
		}

	return largest;
	}


	public static String [] getGrade(int [] anArrayOfScore){

		String [] arrayOfGrades = new String[anArrayOfScore.length];

		for(int count = 0; count < anArrayOfScore.length; count++){
			if(anArrayOfScore[count] >= (largestIn(anArrayOfScore) - 10)){
				arrayOfGrades[count] = "A";
			}
			else if(anArrayOfScore[count] >= (largestIn(anArrayOfScore) - 20)){
				arrayOfGrades[count] = "B";
			}
			else if(anArrayOfScore[count] >= (largestIn(anArrayOfScore) - 30)){
				arrayOfGrades[count] = "C";
			}
			else if(anArrayOfScore[count] >= (largestIn(anArrayOfScore) - 40)){
				arrayOfGrades[count] = "D";
			}
			else{
				arrayOfGrades[count] = "F";
			}
		}

		return arrayOfGrades;
	}




	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of students: ");
		int numberOfStudents = input.nextInt();

		int [] arrayOfScores = new int[numberOfStudents];

		System.out.printf("Enter %d scores: ", numberOfStudents);
		for(int count = 0; count < arrayOfScores.length; count++){
			arrayOfScores[count] = input.nextInt();
		}

		String [] grades = getGrade(arrayOfScores);

		for(int count = 0; count < arrayOfScores.length; count++){
			System.out.printf("Student %d scores is %d and grade is %s%n", count, arrayOfScores[count], grades[count]);
		}
	}

	
}