//Question 57 

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        int choice = 0;

        do{
            System.out.println("1 = ADD, 2 = Substract, 3 = Exit");
            choice = input.nextInt();
        }while(choice != 3);
    }
}
