import java.util.Scanner;
    public class ClassAverageProgramWhileLoop{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter total number of students: ");
            int numberOfStudents = input.nextInt();

            int total = 0;
            int gradeCounter = 1;
            
            while(gradeCounter <= numberOfStudents){
                System.out.println("Enter grade of student: ");
                int grade = input.nextInt();
                    if(grade > 0 && grade <= 100){
                        total = total + grade;
                        gradeCounter++ ;
                    }
                    else{
                        System.out.println("Invalid Grade!");
                        System.exit(0);
                    }
                        
                    
            }

            int average = total / numberOfStudents ;

            System.out.printf("Total: %d%n", total);
            System.out.printf("Average: %d%n", average);

        }
    }
