//Question 71

import java.util.Scanner;

public class PassFailLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 1;
        int passCounter = 0;
        int failCounter = 0;

        while(count <= 10){
            System.out.println("Enter Score");
            int score = input.nextInt();

            if(score < 0 || score >100){
                System.out.println("Invalid Score");
            }else{
                if(score >= 50){
                    System.out.println("PASS");
                    passCounter++;
                }else{
                    System.out.println("FAIL");
                    failCounter++;
                }
            }
        count++;
        }
        System.out.printf("Number of pass: %d%nNumber of fails: %d%n", passCounter, failCounter);
    }
}
