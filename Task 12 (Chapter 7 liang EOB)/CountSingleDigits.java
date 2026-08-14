import java.util.Scanner;

import java.util.Random;

public class CountSingleDigits {
	public static void main(String... args){
		Scanner input = new Scanner(System.in);
		Random random = new Random();

		int [] frequency = new int[10];

		for(int count = 0; count < 100; count++){

			int randomNumber = random.nextInt(10);

			if(randomNumber == 0) ++frequency[0];
			if(randomNumber == 1) ++frequency[1];
			if(randomNumber == 2) ++frequency[2];
			if(randomNumber == 3) ++frequency[3];
			if(randomNumber == 4) ++frequency[4];
			if(randomNumber == 5) ++frequency[5];
			if(randomNumber == 6) ++frequency[6];
			if(randomNumber == 7) ++frequency[7];
			if(randomNumber == 8) ++frequency[8];
			if(randomNumber == 9) ++frequency[9];
		}

		System.out.printf("%5s %10s%n", "Numbers","Frequency");

		for(int integers = 0; integers < frequency.length; integers++){
			System.out.printf("%d %9d%n", (integers), frequency[integers]);
		}
	}
}