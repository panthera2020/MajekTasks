/*
1 print the first two sequences
2 using loop add the numbers previous numbers and print at every iteration
*/

public class Fibonnaci {
	public static void main(String[]args){
		System.out.print("Fibonnaci Numbers: " + 0 + ", " + 1 + ", ");

		int sum = 0;

		for(int count = 1; count <= 8; count++){
			sum += count;
			System.out.print(sum + ", ");
		}
	}
}