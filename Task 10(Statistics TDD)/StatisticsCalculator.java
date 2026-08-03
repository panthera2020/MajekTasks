public class StatisticsCalculator{

	public static int calculateRangeOf(int[] numbers){
		return findLargestNumberIn(numbers) - findSmallestNumberIn(numbers);

	}


	private static int findLargestNumberIn(int[] numbers){
		int largest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] > largest)
				largest = numbers[index];
		}
		return largest;
	}

	private static int findSmallestNumberIn(int[] numbers){
		int smallest = numbers[0];
		for(int index = 0; index < numbers.length; index++){
			if(numbers[index] < smallest)
				smallest = numbers[index];
		}
		return smallest;
	}

	private static int findSumOfNumbersIn(int[] numbers){
		var sum = 0;

		for(int index = 0; index < numbers.length; index++){
			sum += numbers[index];
		}

		return sum;
	}

	public static double calculateMeanOf(int[] numbers){
		return Math.round(((double)findSumOfNumbersIn(numbers) / numbers.length));
	}

	private static int[] arrangeArrayInDescendingIn(int[] numbers){
		int temp = 0;

		for(int count = 0; count < numbers.length; count++){
			for(int counter = 0; counter < numbers.length; counter++){
				if(numbers[counter] < numbers[count]){
					temp = numbers[count];
					numbers[count] = numbers[counter];
					numbers[counter] = temp;
				}
			}
		}

		return numbers;
	}

	public static int calculateMedianOf(int[] numbers){
		int[] arrayofNumbersInDescendingNumbers = arrangeArrayInDescendingIn(numbers);
		int median = 0;

		if(numbers.length % 2 != 0){
			median = arrayofNumbersInDescendingNumbers[(numbers.length - 1) / 2];
		}else if(numbers.length % 2 == 0){
			median = (arrayofNumbersInDescendingNumbers[(numbers.length / 2) - 1] + arrayofNumbersInDescendingNumbers[(numbers.length) / 2]) / 2;
		}

		return median;
	}

	public static int calculateModeOf(int[] numbers){
		int mode = 0;
		int temporaryCounter = 0;

		for(int count = 0; count < numbers.length; count++){
			int counter = 0;
			for(int index = 0; index < numbers.length; index++){
				if(numbers[count] == numbers[index]){
					counter += 1;
				}
			}

			if(counter > temporaryCounter){
				mode = numbers[count];
			}
			temporaryCounter = counter;
		}
		return mode;
	}

	public static double[] calculateDeviationOf(int[] numbers){
		double [] Deviation = new double[numbers.length];

		for(int index = 0; index < numbers.length; index++){
			Deviation[index] = numbers[index] - calculateMeanOf(numbers);
		}

		return Deviation;
	}

	public static double calculateMeanDeviationOf(int[] numbers){
		int sum = 0;

		double meanDeviation = 0;

		double [] deviationOfNumbers = calculateDeviationOf(numbers);

		for(int index = 0; index < numbers.length; index++){
			sum += Math.abs(deviationOfNumbers[index]);
		}

		meanDeviation = (double)sum / numbers.length;

		return meanDeviation;
	}

	public static double calculateVarianceOf(int[] numbers){
		int sum = 0;

		double variance = 0;

		double [] deviationOfNumbers = calculateDeviationOf(numbers);

		for(int index = 0; index < numbers.length; index++){
			sum += Math.pow(deviationOfNumbers[index], 2);
		}

		variance = (double)sum / numbers.length;

		return variance;
	}

	public static double calculateStandardDeviationOf(int[] numbers){
		double standardDeviation = Math.round(Math.pow((calculateVarianceOf(numbers)), 0.5));
		return standardDeviation;
	}

	public static double calculateCoefficientOfVarianceOf(int[] numbers){
		double coefficientOfVariance = (calculateStandardDeviationOf(numbers) / calculateMeanOf(numbers)) * 100;
		return coefficientOfVariance;
	}

}