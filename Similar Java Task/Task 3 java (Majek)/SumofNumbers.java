//Question 3

/*PSUEDOCODE
1 intialize variabe to 10, since we want to start add from 10
2 initialize counter to count the number of loops to count from 11 to 20
3 Get sum of variable and counter
4 switch the intialized variable into the new sum value
6 increase the counter by 1
7 when the loop finishes print the sum 
*/

public class SumofNumbers{
	public static void main(String[]args){
	
		
		int a = 10;
		int counter = 11;
		int sum = 0;

		while(counter <= 20){
			sum = a + counter;
			a = sum;
		counter++;
		}
		 

		System.out.printf("Total Sum: %d%n", sum);
	}
}