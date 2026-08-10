import java.util.Scanner;

public class FindLargestSmallest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Integer: ");
        int num2 = input.nextInt();
        System.out.print("Enter Third Integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = (int)((num1 + num2 + num3)/3);
        int product = num1 * num2 * num3;
    
        if(num1 > num2 && num1 > num3){
            if(num2 > num3){
            System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num1, num3);
        }
            if(num3 > num2){
                System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num1, num2);
            }
        }
        if(num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num2, num3);
            }
            if(num3 > num1){
                System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num2, num1);
            }
        }
        if(num3 > num1 && num3 > num2){
            if(num1 > num2){
                System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num3, num2);
            }
            if(num2 > num1){
                System.out.printf("sum = %d%n average = %d%n product = %d%n largest = %d%n smallest = %d%n", sum, average, product, num3, num1);
            }
        }
        
    }
}
