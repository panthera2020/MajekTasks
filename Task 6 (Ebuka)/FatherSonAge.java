/* Question 1
collect Fathers age
collect sons age
Calculate how many years ago father was twice son's age, 2(son age) - fatherage
Display result
*/

import java.util.Scanner;

public class FatherSonAge {
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);

			System.out.print("Enter Father's Age: ");
			int fatherAge = userInput.nextInt();

			System.out.print("Enter Son's Age: ");
			int sonAge = userInput.nextInt();

		if(fatherAge > 0 && fatherAge <= 80 && sonAge > 0 && sonAge <= 80){
			int years = (2 * sonAge) - fatherAge;
			if(years < 0){
				System.out.printf("Father's was twice son's age %d years ago", -(years));
			}else{
				System.out.printf("Father's was twice son's age %d years ago", years);
			}
			
		}else{
			System.out.print("Invalid Input");
		}
	}
}