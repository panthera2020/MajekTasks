//Question 3 
/*PSEUDOCODE
1 Inputs 4 integers
2 Calculate the sum, integer average, and product
3 Determine the smallest and largest number
4 Print result
*/

import java.util.Scanner;
	public class SmallestAndLargest{
		public static void main(String[]args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter four integers: ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			int num3 = input.nextInt();
			int num4 = input.nextInt();

			int sum = num1 + num2 + num3 + num4;
			int product = num1 * num2 * num3 * num4;
			int average = (int)(sum / 4);

			if(num1 > num2 && num1 > num3 && num1 > num4){
				if(num2 < num3 && num2 < num4){
				System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num1, num2);
				}
				if(num3 < num2 && num3 < num4){
				System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num1, num3);
				}
				if(num4 < num2 && num4 < num3){
				System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num1, num4);
				}
			}

			if(num2 > num1 && num2 > num3 && num2 > num4){
				if(num1 < num3 && num1 < num4){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num2, num1);
				}
				if(num3 < num1 && num3 < num4){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num2, num3);
				}
				if(num4 < num1 && num4 < num3){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num2, num4);
				}
			}

			if(num3 > num1 && num3 > num2 && num3 > num4){
				if(num1 < num2 && num1 < num4){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num3, num1);
				}
				if(num2 < num1 && num2 < num4){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average, num3, num2);
				}
				if(num4 < num1 && num4 < num2){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average, num3, num4);
				}
				
			}

			if(num4 > num1 && num4 > num2 && num4 > num3){
				if(num1 < num2 && num1<num3){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num4, num1);
				}
				if(num2 < num1 && num2 < num3){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num4, num2);
				}
				if(num3 < num1 && num3 < num4){
					System.out.printf("sum: %d%nProduct: %d%nAverage: %d%nLargest: %d%nSmallest: %d", sum, product, (int)average,num4, num3);
				}
			}
		}
	}