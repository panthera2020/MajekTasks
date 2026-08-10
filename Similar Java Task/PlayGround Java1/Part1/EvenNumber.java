/*
1 start counting from 0 and then keep adding 2 till we get to 100
*/


public class EvenNumber {
	public static void main(String[]args){
		
		for(int counter = 2; counter <= 100; counter += 2){
			System.out.print(counter);
			System.out.print(" ");
		}
	}
}