/* Question 36
1 collect a character input from the user
2 covert all to samecase incase there are upper or lowercase of the same letter
3 Check if the input is a,e,i,o,u and print vowel
4 if not print consonant 
*/

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Character: ");
		String letter = input.nextLine();
		
		String a = "a";
		String e = "e";
		String i = "i";
		String o = "o";
		String u = "u";
		
		
		if(letter.equalsIgnoreCase(a) || letter.equalsIgnoreCase(e) || letter.equalsIgnoreCase(i) || letter.equalsIgnoreCase(o) || letter.equalsIgnoreCase(u) ){
			System.out.println("Vowel");
		}else{
			System.out.print("Consonant");
		}
	}
}