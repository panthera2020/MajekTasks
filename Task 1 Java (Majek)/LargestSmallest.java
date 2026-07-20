//Question 5
/*PSUEDOCODE
1 Input 6 integers
2 Determine the largest and smallest number using if statement
3 Print result
*/

import java.util.Scanner;
	public class LargestSmallest{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter 6 integers: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();
			int num5 = input.nextInt();
			int num6 = input.nextInt();


			if(num1 > num2 && num1 > num2 && num1 > num3 && num1 > num5 && num1 > num6){
				if(num2 < num3 && num2 < num4 && num2<num5 && num2<num6){
				System.out.printf("Largest: %d%nSmallest: %d", num1, num2);
				}
				if(num3<num2 && num3<num4 && num3<num5 && num3<num6){
				System.out.printf("Largest: %d%nSmallest: %d", num1, num3);
				}
				if(num4<num3 && num4<num5 && num4<num2 && num4<num6){
				System.out.printf("Largest: %d%nSmallest: %d", num1, num4);
				}
				if(num5<num3 && num5<num4 && num5<num4 && num5<num6){
				System.out.printf("Largest: %d%nSmallest: %d", num1, num5);
				}
				if(num6<num2 && num6<num3 && num6<num4 && num6<num5){
				System.out.printf("Largest: %d%nSmallest: %d", num1, num6);
				}

			}

			if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5 && num2 > num6){
				if(num1<num3 && num1<num4 && num1<num5 && num1<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num2, num1);
				}
				if(num3<num1 && num3<num4 && num3<num5 && num3<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num2, num3);
				}
				if(num4<num1 && num4<num3 && num4<num5 && num4<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num2, num4);
				}
				if(num5<num1 && num5<num3 && num5<num4 && num5<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num2, num5);
				}
			}

			if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5 && num3 > num6){
				if(num1<num2 && num1<num4 && num1<num5 && num1<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num3, num1);
				}
				if(num2<num1 && num2<num4 && num2<num5 && num2<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num3, num2);
				}
				if(num4<num1 && num4<num3 && num4<num5 && num4<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num3, num4);
				}
				if(num5<num1 && num5<num3 && num5<num4 && num5<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num3, num5);
				}
				if(num6<num1 && num6<num3 && num6<num4 && num6<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num3, num6);
				}
			}

			if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5 && num4 > num6){
				if(num1<num2 && num1<num3 && num1<num5 && num1<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num4, num1);
				}
				if(num2<num1 && num2<num3 && num2<num5 && num2<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num4, num2);
				}
				if(num3<num1 && num3<num4 && num3<num5 && num3<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num4, num3);
				}
				if(num5<num1 && num5<num2 && num5<num3 && num5<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num4, num5);
				}
				if(num6<num1 && num6<num2 && num6<num3 && num6<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num4, num6);
				}
			}

			if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4 && num5 > num6){
				if(num1<num2 && num1<num3 && num1<num4 && num1<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num5, num1);
				}
				if(num2<num1 && num2<num3 && num2<num4 && num2<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num5, num2);
				}
				if(num3<num1 && num3<num2 && num3<num4 && num3<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num5, num3);
				}
				if(num4<num1 && num4<num2 && num4<num3 && num4<num6){
					System.out.printf("Largest: %d%nSmallest: %d", num5, num4);
				}
				if(num6<num1 && num6<num2 && num6<num3 && num6<num4){
					System.out.printf("Largest: %d%nSmallest: %d", num5, num6);
				}
			}

			if(num6 > num1 && num6 > num2 && num6 > num3 && num6 > num4 && num6 > num5){
				if(num1<num2 && num1<num3 && num1<num4 && num1<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num6, num1);
				}
				if(num2<num1 && num2<num3 && num2<num4 && num2<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num6, num2);
				}
				if(num3<num1 && num3<num2 && num3<num4 && num3<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num6, num3);
				}
				if(num4<num1 && num4<num2 && num4<num3 && num4<num5){
					System.out.printf("Largest: %d%nSmallest: %d", num6, num4);
				}
				if(num5<num1 && num5<num2 && num5<num3 && num5<num4){
					System.out.printf("Largest: %d%nSmallest: %d", num6, num5);
				}
			}
	}
}

