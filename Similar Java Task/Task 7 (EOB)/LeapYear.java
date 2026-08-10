/*Question 9
*/

public class LeapYear {
	public static void main(String[] args){

		int year = 0;
		int count = 0;

		for(year = 2000; year <= 2100; year++){
				if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
					System.out.print(year + " ");
				}
		}
	}
}




//(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)