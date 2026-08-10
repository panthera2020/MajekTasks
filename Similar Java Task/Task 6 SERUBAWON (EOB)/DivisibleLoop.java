// Question 82

import java.util.Scanner;

public class DivisibleLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        int number = 0;
        int byTwoCounter = 0;
        int byThreeCounter = 0;
        int byBothCounter = 0;
        int byNeitherCounter = 0;

        while(counter < 10){
            System.out.println("Enter Integer");
            number = input.nextInt();

            if(number % 2 == 0 && number % 3 != 0){
                byTwoCounter++;
            }
            if(number % 3 == 0 && number % 2 != 0){
                byThreeCounter++;
            }
            if(number % 2 == 0 && number %3 == 0){
                byBothCounter++;
            }
            if(number % 2 != 0 && number %3 != 0){
                byTwoCounter++;
            }
        counter++;
        }

        System.out.println("Numbers divisible by 2 only are " + byTwoCounter);
        System.out.println("Numbers divisible by 3 only are " + byThreeCounter);
        System.out.println("Numbers divisible by 2 and 3 are " + byBothCounter);
        System.out.println("Numbers divisible by neither are " + byNeitherCounter);
    }    
}
