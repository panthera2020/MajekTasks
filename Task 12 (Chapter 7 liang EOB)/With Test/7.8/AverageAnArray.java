public class AverageAnArray {

	public static double average(double[] arrayOfNumbers){
		double sum = 0;

		for(int count = 0; count < arrayOfNumbers.length; count++){
			sum += arrayOfNumbers[count];
		}

	double average = (double)sum / arrayOfNumbers.length;

	return average; 
	}

	public static int average(int[] arrayOfNumbers){
		int sum = 0;

		for(int count = 0; count < arrayOfNumbers.length; count++){
			sum += arrayOfNumbers[count];
		}

	int average = sum / arrayOfNumbers.length;

	return average; 
	}
}