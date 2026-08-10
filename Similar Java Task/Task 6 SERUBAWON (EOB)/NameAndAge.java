/*
1 Collect name as a string
2 Collect age as an integer
3 print hello name, you are (age) years old
*/

import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");
    }
}