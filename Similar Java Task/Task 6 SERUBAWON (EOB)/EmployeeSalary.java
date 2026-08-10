/* Question 86
1 Collect basic salary 
2 calculate tax
3 if salary is less than 50k no tax
4 50k to 150k 10%, salary * 0.1
5 150k above, salary * o.2
6 Substract tax
7 print gross, taxed and net pay
8 put in a loop for five employees
*/

import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        double taxedPay = 0;
        double netPay = 0;

        while(count <= 5){
            System.out.println("Enter Salary: ");
            double salary = input.nextDouble();

            if(salary <= 50000){
                taxedPay = salary * 1;
            }else if(salary >50000 && salary <=150000){
                taxedPay = salary * 0.1;
            }else{
                taxedPay = salary * 0.2;
            }

            netPay = salary - taxedPay;

            System.out.println("Gross pay: " + salary);
            System.out.println("Tax: " + taxedPay);
            System.out.println("Net pay: " + netPay);

        count++;
        }
    }
}
