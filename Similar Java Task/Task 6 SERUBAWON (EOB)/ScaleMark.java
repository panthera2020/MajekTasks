/* Question 18
1 Collect integer
2 use an if statement to restrict it to 0 to 50
3 if its within that range, divide input by 50 and multiply by 100 to scale it to 100
4 Print original mark and scaled mark
*/


import java.util.Scanner;

public class ScaleMark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Score(0-50): ");
        int mark = input.nextInt();

        if (mark >= 0 && mark <= 50) {
            double scaledMark = (mark / 50.0) * 100;
            System.out.println("Original Mark: " + mark);
            System.out.println("Scaled Mark: " + scaledMark);
        } else {
            System.out.println("Invalid Score");
        }
    }
}
