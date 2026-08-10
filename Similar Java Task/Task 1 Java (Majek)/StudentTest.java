public class StudentTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first student's name: ");
        String name = input.nextLine();
        System.out.print("Enter the first student's average: ");
        double average = input.nextDouble();
        // Student account1 = new Student();
        // Student account2 = new Student();

        Student student1 = new Student(name, average);
        System.out.printf("%s's letter grade is: %s%n",
            student1.getName(), student1.getLetterGrade() );
        
    }
    
}
