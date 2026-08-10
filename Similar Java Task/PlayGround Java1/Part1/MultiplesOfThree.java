/*
start counting from 1 to 50
modulo each of the number by 3
if the modulo is equals zero, its a multiple of 3
print the number
*/

public class MultiplesOfThree {
	public static void main(String[]args){
		
		for(int counter = 1; counter <= 50; counter++){
			
			if(counter % 3 == 0){
				System.out.print(counter);
				System.out.print(" ");
			}
		}
	}
}