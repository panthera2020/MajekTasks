public class ToLowerAndUpperCase {
	public static void main(String[]args){
		String word = "EMMANUEL";

		for(int count = 0; count < word.length(); count++){
			System.out.print(word.toLowerCase().charAt(count));
		}
	}
}