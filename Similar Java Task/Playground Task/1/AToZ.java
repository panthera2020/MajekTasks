// Question 1

/*
1 Create a string variable and input A to Z
2 then print the character at each point using char.At
*/

public class AToZ {
	public static void main(String[]args){
		String word = "ABCDEFGHIJKLMONPQRSTUVWXYZ";

		for(int letter = 0; letter < word.length(); letter++){
			System.out.print(word.charAt(letter) + " ");
		}
	}
}