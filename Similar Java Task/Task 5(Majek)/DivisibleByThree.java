//5.12

/*
1 check number between 1 to 30 using loop,
2 for each loop divide by 3 to see if it has zero remainder
3 add each of the number togther to get the sum 
4 print total sum
*/

public class DivisibleByThree {
	public static void main(String[]args){

		int total = 0;
	
		for(int count = 1; count <= 30; count++){
			if(count % 3 == 0){
				total += count;
			}
		}

		System.out.println("Sum of number between 1 and 30 divisible by 3 is " + total);
	}
}