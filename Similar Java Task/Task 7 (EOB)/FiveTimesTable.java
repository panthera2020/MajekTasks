/*Question 3
use a loop to multiple 5 by an iteration of 12 loops 
Print the result of each loop
*/

public class FiveTimesTable {
	public static void main(String[]args){

		for(int count = 1; count <= 12; count++){
			System.out.println("5 * " + count + " = " + (count * 5));
		}
	}
}