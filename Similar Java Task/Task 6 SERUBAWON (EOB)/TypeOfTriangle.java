/* Question 43
1 collect side of the triangle as sideA, sideB, sideC
2 if sideA, sideB, sideC are equal, print Equilateral triangle
3 if sideA and sideB are equal or sideB and sideC are equal or sideA and sideC are equal, print Isosceles triangle
4 if sideA, sideB, sideC are not equal, print Scalene triangle 
 */
import java.util.Scanner;

public class TypeOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side A: ");
        double sideA = scanner.nextDouble();

        System.out.print("Enter side B: ");
        double sideB = scanner.nextDouble();

        System.out.print("Enter side C: ");
        double sideC = scanner.nextDouble();

        if (sideA == sideB && sideB == sideC && sideA == sideC) {
            System.out.println("Equilateral triangle");
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}

