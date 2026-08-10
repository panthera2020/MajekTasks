/* Question 45
1 collect input between one and 12
2 Using Switch case, every month from january should have a case with respecive numbering 1 to 12
3 For septmber, april june and november, should print 30days
4 for febraury, 28 days
6 the remaining month should be 31days
7 Collect input for Years
8 determine if the year input is a leap year by dividing by 4, if divisible by 4, print its a leap year
*/
import java.util.Scanner;

public class DaysInAMonth {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Integer: ");
        int month = input.nextInt();

        System.out.println("Enter Year");
        int year = input.nextInt();

        switch (month) {
            case 1 :
                System.out.print("January has 31 days");
                break;
            case 2 :
                if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
                    System.out.print("February has 29 days");
                }else{
                    System.out.print("February has 28 days");
                }
                break;
            case 3 :
                System.out.println("March has 31 days");
                break;
            case 4 :
                System.out.println("April has 30 days");
                break;
            case 5 :
                System.out.println("May has 31 days");
                break;
            case 6 :
                System.out.println("June has 30 days");
                break;
            case 7 :
                System.out.println("July has 31 days");
                break;
            case 8 :
                System.out.println("August has 31 days");
                break;
            case 9 :
                System.out.println("September has 31 days");
                break;
            case 10 :
                System.out.println("October has 31 days");
                break;
            case 11 :
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Input is an invalid month");
                break;
        }
    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
        System.out.println(year + " is a leap year");
    }else{
        System.out.println(year + " is not a leap year");
    }
    }

}
