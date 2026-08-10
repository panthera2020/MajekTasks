/*
1 import Scanner class
2 collect the two integers, one as hours and the other as minutes
3 convert the minutes to hours and then add both
4 print the total time
*/

import java.util.Scanner;

public class TotalTime {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter Integer(HH:MM):");
		double hours = input.nextInt();
		double minutes = input.nextInt();

		double minutesToHours = minutes / 60;
		double totalTime = hours + minutesToHours;

		System.out.printf("The total time is %.2f hours", totalTime);
		
	}
}