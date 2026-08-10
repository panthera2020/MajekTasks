// count from 1 to 50 
// initialize varible to add each number
//then add each number respectively

public class ProductsOfNumbers {
	public static void main(String[]args){

		int product = 1;
		
		for(int counter = 1; counter <= 10; counter++){
			product *= counter;
		}

		System.out.print(product);
	}
}