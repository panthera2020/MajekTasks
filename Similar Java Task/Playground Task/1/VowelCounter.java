/*
1 compare the word if they are similar to the vowels using the if statement in the loop
2 initialize a vowel counter to count the number of vowels
*/

public class VowelCounter {
	public static void main(String[]args){
		String word = "Emmanuel";
		int vowelCounter = 0;

		for(int count = 0; count < word.length(); count++){
			if((word.toLowerCase().charAt(count) == 'a') || (word.toLowerCase().charAt(count) == 'e') || (word.toLowerCase().charAt(count) == 'i') || (word.toLowerCase().charAt(count) == 'o') || (word.toLowerCase().charAt(count) == 'u')){
				vowelCounter++;
			}
		}

		System.out.printf("The number of vowels are %d", vowelCounter);
	}
}