//2.10

/*
1 collect input for weight
2 collect input for initial and final temperature
3 Calculate energy
4 print result
*/

import java.util.Scanner;

public class CalculatingEnergy {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kilograms: ");
        double weight = input.nextDouble();

        System.out.print("Enter initial temperature in Celsius: ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter final temperature in Celsius: ");
        double finalTemp = input.nextDouble();

        double energy = weight * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is " + energy + " Joules.");
    }
}