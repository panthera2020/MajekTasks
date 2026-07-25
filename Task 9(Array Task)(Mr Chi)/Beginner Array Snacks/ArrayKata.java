public class ArrayKata {

	public static int lar(int... numbers){
		int largest = numbers[0];
		for(int input = 1; input < numbers.length; input++){
			if(numbers[input] > largest){
				largest = numbers[input];
			}
		}

	return largest;
	}

	public static int small(int[] numbers){
		int smallest = numbers[0];
		for(int input = 1; input < numbers.length; input++){
			if(numbers[input] < smallest){
				smallest = numbers[input];
			}
		}

	return smallest;
	}

	public static int sum(int... numbers){
		int sum = 0;
		for(int input = 0; input < numbers.length; input++){
			sum += numbers[input];
		}

	return sum;
	}

	public static int evenSum(int... numbers){
		int sum = 0;
		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 == 0){
				sum += numbers[input];
			}
		}

	return sum;
	}

	public static int oddSum(int... numbers){
		int sum = 0;
		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 != 0){
				sum += numbers[input];
			}
		}

	return sum;
	}

	public static int[] minMax(int... numbers){
		int[] largestAndSmallest = {lar(numbers) , small(numbers)};

	return largestAndSmallest;
	}

	public static int countEven(int... numbers){
		int count = 0;
		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 == 0){
				count++;
			}
		}

	return count;
	}

	public static int countOdd(int... numbers){
		int count = 0;
		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 != 0){
				count++;
			}
		}

	return count;
	}

	public static int[] printEven(int... numbers){
		int[] evenNumbers = new int[countEven(numbers)];

		int evenInput = 0;

		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 == 0){
				evenNumbers[evenInput] = numbers[input];
				evenInput++;
			}
		}

	return evenNumbers;
	}

	public static int[] printOdd(int... numbers){
		int[] oddNumbers = new int[countOdd(numbers)];

		int oddInput = 0;

		for(int input = 0; input < numbers.length; input++){
			if(numbers[input] % 2 != 0){
				oddNumbers[oddInput] = numbers[input];
				oddInput++;
			}
		}

	return oddNumbers;
	}

	public static int[] square(int... numbers){
		int[] squareOfNumbers = new int[numbers.length];

		for(int input = 0; input < numbers.length; input++){
			squareOfNumbers[input] = numbers[input] * numbers[input];
		}

	return squareOfNumbers;
	}
}