// Question 67

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Integer");
        double number = input.nextInt();

        double count = 1;
        double sum = 0;

        for(count = 1; count <= number; count++){
            sum = sum + ((double)1 / count);
        }

        System.out.printf("Sum: %.4f%n", sum);
    }
}
