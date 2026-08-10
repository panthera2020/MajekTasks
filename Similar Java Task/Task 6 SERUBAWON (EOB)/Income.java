/*Question 40
1 collect users income 
2 if income is less than 300,000, 0% tax
3 if income is between 300,000 and 600,000, 7% tax
4 if income is above 600,000, 15% tax
5 calculate tax, (income * tax rate)
6 print total tax owed
*/

import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your income: ");
        double income = input.nextDouble();
        
        double taxRate = 0;
        
        if (income < 300000) {
            taxRate = 0.0;
        } else if (income >= 300000 && income <= 600000) {
            taxRate = 0.07;
        } else {
            taxRate = 0.15;
        }
        
        double taxOwed = income * taxRate;
        
        System.out.printf("Total tax owed: %.2f%n", taxOwed);
    }
}