//Question 68

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = 0;

        do{
            System.out.println("Guess the number");
            number = input.nextInt();
            if(number < 0 || number > 10){
                System.out.println("Invalid input");
            }
        }while(number != 7);
    }
}
