import java.util.Scanner;
public class SumProduct{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = input.nextInt();

        System.out.println("Enter second number ");
        int number2 = input.nextInt();

        System.out.print("Enter third number: ");
        int number3 = input.nextInt();

            int sum = number1 * number2 * number3;
        
        System.out.printf("The product of the three number is %n%d%n", sum);
    }
}