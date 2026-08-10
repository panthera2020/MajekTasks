/*Question 15
Use one loop to print from 7 to 1 
another loop to print from 2 to 7
*/

public class PrintPatterns {
	public static void main(String[] args){

		for(int count = 7; count >=1; count--){
			System.out.print(count + " ");
		}
		for(int counts = 2; counts <=7; counts++){
			System.out.print(counts + " ");
		}
	}
}