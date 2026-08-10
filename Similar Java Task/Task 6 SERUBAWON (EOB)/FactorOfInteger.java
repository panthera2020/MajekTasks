// Question 65

import java.util.Scanner;

public class FactorOfInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");
        int number = input.nextInt();

        int count = 1;
        if(number < 0){
            System.out.println("Invalid Input");
        }else{
            while(count <= 50){
                if(number % count == 0){
                    System.out.println(count);
                }
            count++;
            }
        }
    }
}
