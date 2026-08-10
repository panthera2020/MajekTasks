import java.util.Scanner;

public class LargestDigit {
	public static void main(String[]args){
		Scanner input =  new Scanner(System.in);

		System.out.print("Enter Integer: ");
		int number = input.nextInt();

		int digits = number;
		int largest = 0;
		int ten = 1;
		int digitSeperator = 0;

		for(int count = 0; digits > 0; count++){
			digits = number / ten;
			digitSeperator = digits % 10;
				if(digitSeperator > largest){
					largest = digitSeperator;
				}

		ten *= 10;
		}

		System.out.print("The largest of the digits is " + largest);
	}
}