/* Question 23
1 Collect score 
2 Make sure score is between 0 and 100
3 If score is between 90 and 100, print A
4 If score is between 80 and 89, print B
5 If score is between 70 and 79, print C
6 If score is between 60 and 69, print D
7 if score is below 60, print F
*/

import java.util.Scanner;

public class GradeScore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the score (0-100): ");
        int score = input.nextInt();

        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score <= 100 && score >= 90) {
            System.out.println("Grade: A");
        } else if (score <= 89 && score >= 80) {
            System.out.println("Grade: B");
        } else if (score <= 79 && score >= 70) {
            System.out.println("Grade: C");
        } else if (score <= 69 && score >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}
