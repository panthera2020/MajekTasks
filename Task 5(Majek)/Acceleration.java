//2.9

/*
1 collect input for v1 in meter/seconds
2 collect input for v2 in meter/seconds
3 collect inout for t in seconds
4 calculate average acceleration
5 print result
*/

import java.util.Scanner;

public class Acceleration {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter v1 in meter/seconds: ");
        double v1 = input.nextDouble();

        System.out.print("Enter v2 in meter/seconds: ");
        double v2 = input.nextDouble();

        System.out.print("Enter t in seconds: ");
        double t = input.nextDouble();

        double acceleration = (v2 - v1) / t;

        System.out.println("The average acceleration is " + acceleration + " meters/second^2.");
    }
}