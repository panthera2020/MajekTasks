//Question 62
/*
A sentinel value is an value or dummy flag that can be used to stop a loop
*/

import java.util.Scanner;

public class SentinelValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter Number, Enter -999 to quit");
        int number = input.nextInt();

        while(number != -999){
            System.out.println("Enter Number, Enter -999 to quit");
            number = input.nextInt();
        }
    }
}
