//Question 15
/*PSUEDOCODE
1 Input speed integer
2 Check if speed is 120 or below, no violation
3 speed between 121 and 140, warning, fine 5000
4 speed between 141 and 160, Serious violation, fine 150000,
5 speed over 160, dangerous driving, fine 50000, licence suspension.
*/

import java.util.Scanner;
    public class FineCalculator{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter speed: ");
            int speed = input.nextInt();

            if(speed <= 120){
                System.out.println("No violation");
            }
            if(speed >= 121 && speed <= 140){
                System.out.println("Warning, fine 5000");
            }
            if(speed >= 141 && speed <= 160){
                System.out.println("Serious violation, fine 15000");
            }
            if(speed > 160){
                System.out.println("Dangerous driving, fine 50000, licence suspension");
            }
        }
}
