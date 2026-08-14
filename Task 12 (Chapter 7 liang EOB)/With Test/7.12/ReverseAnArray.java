public class ReverseAnArray {
		public static int [] reverseArray(int[] arrayOfNumbers){
		int store = 0;

		for(int count = 0; count < (arrayOfNumbers.length / 2); count++){
			store = arrayOfNumbers[count];
			arrayOfNumbers[count] = arrayOfNumbers[(arrayOfNumbers.length - 1) - count];
			arrayOfNumbers[(arrayOfNumbers.length - 1) - count] = store;
		}

	return arrayOfNumbers;
	}
}