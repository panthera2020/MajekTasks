/*Question
Collect two character 
Store first and second character in a char data variable and trim to collect only one input and also account for lower case
Use Switch case for the students major and in each switch case use a sellection statement to determine the year
Print Full major name and year status for each selection
*/

import java.util.Scanner;

public class StudentMajorAndYear {
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.println("""
			First character(For Your Major)
			Second Character(For Your Year)
			""");
		char studentMajor = input.next().trim().toUpperCase().charAt(0);
		char year = input.next().trim().toLowerCase().charAt(0);

		switch (studentMajor){
			case 'I': 
				switch (year){
					case '1': System.out.println("Student Major: Information Management \nYear: Freshman");
						break;
					case '2': System.out.println("Student Major: Information Management \nYear: Sophomore");
						break;
					case '3': System.out.println("Student Major: Information Management \nYear: Junior");
						break;
					case '4': System.out.println("Student Major: Information Management \nYear: Senior");
						break;
				}
				break;
			case 'C': 
				switch (year){
					case '1': System.out.println("Student Major: Computer Science \nYear: Freshman");
						break;
					case '2': System.out.println("Student Major: Computer Science \nYear: Sophomore");
						break;
					case '3': System.out.println("Student Major: Computer Science \nYear: Junior");
						break;
					case '4': System.out.println("Student Major: Computer Science \nYear: Senior");
						break;
				}
				break;
			case 'A': 
				switch (year){
					case '1': System.out.println("Student Major: Accounting \nYear: Freshman");
						break;
					case '2': System.out.println("Student Major: Accounting \nYear: Sophomore");
						break;
					case '3': System.out.println("Student Major: Accounting \nYear: Junior");
						break;
					case '4': System.out.println("Student Major: Accounting \nYear: Senior");
						break;
				}
				break;
			default:
				System.out.println("Invalid Input");

		}
	}
}