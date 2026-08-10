// count from 1 to 50 and then add each number respectively

public class SumOfFiftyNumbers {
	public static void main(String[]args){

		int total = 0;
		
		for(int counter = 1; counter <= 50; counter++){
			total += counter;
		}

		System.out.print(total);
	}
}