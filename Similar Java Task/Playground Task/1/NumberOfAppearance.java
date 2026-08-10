/*
1 Use loop to compare if appears many times
2 initialize a counter to count the number of appearance
*/

public class NumberOfAppearance {
	public static void main(String[]args){
		String word = "Emmanuel EEEeee";
		int wordCounter = 0;

		for(int count = 0; count < word.length(); count++){
			if(word.toUpperCase().charAt(count) == 'E'){
				wordCounter++;
			}
		}

		System.out.printf("E appears %d times", wordCounter);
	}
}