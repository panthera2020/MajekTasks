/*
start counting from 1 to 100
modulo each of the number 3 and 5
if the modulo is equals zero, its a multiple of 3 and 5
print the number
*/

public class MultiplesOfThreeAndFive {
	public static void main(String[]args){
		
		for(int counter = 1; counter <= 50; counter++){
			
			if(counter % 3 == 0 && counter % 5 == 0){
				System.out.print(counter);
				System.out.print(" ");
			}
		}
	}
}