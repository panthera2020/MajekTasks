/* Question 20
1 decalre balance as double and set to 5000
2 deposit 1200.50, add to balance
3 update balance to reflect deposit
4 witdrawal 750.25, substract from updated balance
5 Calculate 1.5% interest on the updated balance, add to updated balance
6 print final balance to two decimal places
*/

public class FinalBalance {
    public static void main(String[] args) {
        double balance = 5000.00;

        double depositAmount = 1200.50;
        balance = balance + depositAmount;

        double withdrawalAmount = 750.25;
        balance = balance - withdrawalAmount;

        double interestRate = 1.5 / 100;
        double interest = balance * interestRate;
        balance = balance + interest;

        System.out.printf("Final Balance: %.2f%n", balance);
    }
}
