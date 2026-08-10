/* Question 60
1 Collect grade from users
2 using while loop use sentinal value -1 to stop loop
3 initailize largest score and lowest score
4 declare first input as largest score by default
6 using selection statement compare the numbers for each iteration and detemine the largest and smallest
7 initialize sum and add each iteration 
8 find the average
9 print highest, lowest and average
*/
import java.util.Scanner;

public class ExamScoreWhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int highestScore = 0;
        int lowestScore = 0;
        int sum = 0;
        int counter = 1;

        System.out.println("Enter Grades, Enter -1 to quit:");
        int grade = input.nextInt();
        highestScore = grade;

        while(grade != -1){
            sum += grade; 

            System.out.println("Enter Grades, Enter -1 to quit:");
            grade = input.nextInt();

            if(grade > highestScore){
                lowestScore = highestScore;
                highestScore = grade;
            }
            if(grade < lowestScore){
                lowestScore = grade;
            }
        counter++;
        }

        int average = sum / counter;
        System.out.printf("Highest Score: %d%nLowest Score: %d%nAverage: %d%n", highestScore, lowestScore, average);
    }
}
