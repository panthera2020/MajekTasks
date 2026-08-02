import java.util.ArrayList;
import java.util.Scanner;

class ArrayClass {
	public static void main(String[] args) {
		
		int[] scores = {30, 40, 10, 23, 11};

		ArrayList<Integer> scores = new ArrayList<>();
		int sum = 0;

		if(scores.isEmpty())// the method is used to check if the input was empty
			.size()// used for arraylist to get the length 


		// scores[0] = 25;
		// scores[1] = 25;
		// scores[2] = 25;
		// scores[3] = 25;
		// scores[4] = 25;

		int largest = scores[0];

		for(int count = 0; count < scores.length; count++){
			if(scores[count] > largest){
				largest = scores[count];
			}
		}

		System.out.print("The largest number is:" + largest);
	}
}