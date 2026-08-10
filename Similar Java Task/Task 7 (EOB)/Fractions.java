/*Question 10
*/

public class Fractions {
	public static void main(String[] args){

		double sum = 0;
		for(double count = 1; count < 100; count+= 2){
			sum = sum + ((double)count / (count + 2));
		}
		System.out.println(sum);
	}
}