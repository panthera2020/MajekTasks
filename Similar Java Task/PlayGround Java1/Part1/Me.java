import java.util.Scanner;

	public class Me{
		public static void main(String[]args){

		int smallest = 0;
		int secondSmallest = 0;

		Scanner input = new Scanner(System.in);
		System.out.print("Enter integer: ");
		int number = input.nextInt();

		int counter = 0;
		while (counter < 9){
	
		System.out.print("Enter integer: ");
		number = input.nextInt();

if(number < secondSmallest){
smallest = number;
}
counter++;
}
System.out.printf(" Smallest: %d%n , secondSmallest: %d%n ", smallest, secondSmallest);	

	}
}