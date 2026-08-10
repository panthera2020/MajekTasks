/*Question 8
1 Collect radius as a double
2 Create a constant for pi, 3.14159
3 Calculate area, pi * radius * radius
4 Print area to two decimal places
*/ 

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        final double PI = 3.14159;
        double area = PI * radius * radius;

        System.out.printf("Area of the circle: %.2f%n", area);
    }
}
