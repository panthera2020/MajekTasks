/*
start counting from 1 to 50
modulo each of the number by 7
if the modulo is equals zero, its a multiple of 7
initialize a counter that counts each number thats divisible by 7
print the number
*/

public class DivisilbeBySeven {
	public static void main(String[]args){
		
		int sevenCounter = 0;

		for(int counter = 1; counter <= 50; counter++){
			
			if(counter % 7 == 0){
				sevenCounter++;
			}
		}

		System.out.print("The numbers divisible by 7 are " + sevenCounter);
	}
}