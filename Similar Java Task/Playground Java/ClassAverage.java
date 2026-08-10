import java.util.Scanner;
public class ClassAverage{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int gradeCounter = 1;

        while(gradeCounter < 10){
            System.out.print("Enter your grade: ");
            int grade = input.nextInt();
            total = total + grade;
            gradeCounter++ ; 
        }

        int average = total / 10;

        System.out.printf("%nTotal number is %d%n ", total);
        System.out.printf("The average is %d", average);
    }
}