import java.util.Scanner;
public class AnotherEX {

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);


        // System.out.print("Welcome to P-Bank\nEnter B for Balance \nEnter W for Withdrawal\n");
        // int balance = 10000;
        // String choice = input.nextLine();

        // if(choice.equalsIgnoreCase("B")){
        //     System.out.printf("Your balance is #%d", balance);
        // }
        // if(choice.equalsIgnoreCase("W")){
        //     System.out.print("Amount: ");
        //     int amount = input.nextInt();

        //         if(amount > balance){
        //             System.out.print("Insufficient funds");
        //         }

        //         if(amount <= balance){
        //             int newBalance = balance - amount;
        //             System.out.printf("Withdrawal Successful\n Remaining balance = %d", newBalance);
        //         }
        // }

        // System.out.print("Input Score: ");
        // int score = input.nextInt();

        // if(score >= 90 && score <= 100){
        //     System.out.print("You have an A.");
        // }
        // if(score >=80 && score < 90){
        //     System.out.print("You have a B.");
        // }
        // if(score >= 70 && score < 80){
        //     System.out.print("You have a C.");
        // }
        // if(score >= 60 && score < 70){
        //     System.out.print("You have a D.");
        // }
        // if(score <60){
        //     System.out.print("You have failed!!!");
        // }

        // System.out.print("Input unit: ");
        // int unit = input.nextInt();

        // int x = 10;
        // int y = 15;
        // int z = 20;

        // if(unit <= 100){
        //     int totalBill1 = x * unit;
        //     System.out.printf("Your total consumed unit is %d", totalBill1);
        // }
        // if(unit > 100 && unit <= 300){
        //     int totalBill2 = y * unit;
        //     System.out.printf("Your total consumed unit is %d", totalBill2);
        // }
        // if(unit > 300){
        //     int totalBill3 = z * unit;
        //     System.out.printf("Your total consumed unit is %d", totalBill3);
        // }

        System.out.print("Input weight: ");
        double weight = input.nextDouble();
        System.out.print("Input height: ");
        double height = input.nextDouble();

        double BMI = weight / (height * height);

        if(BMI < 18.5){
            System.out.print("You are Underweight");
        }
        if(BMI >= 18.5 && BMI <= 24.9){
            System.out.print("Normal");
        }
        if(BMI >= 25 && BMI <= 29.9){
            System.out.print("You are Overweight");
        }
        if(BMI >= 30){
            System.out.print("You are Obese");
        }

        // System.out.print("Input Age: ");
        // int age = input.nextInt();
        // System.out.print("Input monthly income: ");
        // int income = input.nextInt();

        // if(age >= 21 && income >= 100000){
        //     System.out.print("You are eligible!!!");
        // }
        // if(age < 21 && income < 100000){
        //     System.out.print("Not eligible!!!");
        // }

        // System.out.print("Input Purchase amount: ");
        // int amount = input.nextInt();
        // double newAmount = (amount - (amount * 0.15));
        // double newAmount1 = (amount - (amount * 0.1));

        // if(amount > 100000){
        //     System.out.printf("Original amount: %d%n Discount: 15%%%n Final amount: %f%n", amount, newAmount);
        // }
        // if(amount > 50000 && amount <= 100000){
        //     System.out.printf("Original amount: %d%n Discount: 10%%%n Final amount: %f%n", amount, newAmount1);
        // }
        // if(amount <= 50000){
        //     System.out.printf("Original amount: %d%n Discount: 0%%%n Final amount: %d%n", amount, amount);
        // }

        // long totalMilliSeconds = System.currentTimeMillis();

        // long totalSeconds = totalMilliSeconds / 1000;
        // long currentSeconds = totalMilliSeconds % 60;

        // long totalMinutes = totalSeconds / 60;
        // long currentMinutes = totalMinutes % 60;

        // long totalHours = totalMinutes / 60;
        // long currentHours = totalHours % 24;

        // System.out.printf("The current time is %d :%d : %d GMT", currentHours, currentMinutes, currentSeconds);
        
        // double a = 6.5;
        // a += a + 1;
        // System.out.println(a);
        // a = 6;
        // a /= 2;
        // System.out.println(a);

        
    }
    
}
