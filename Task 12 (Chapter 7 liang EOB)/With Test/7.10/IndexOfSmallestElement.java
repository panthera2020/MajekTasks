public class IndexOfSmallestElement {

	public static int indexOfSmallestElement(double[] array){
		double smallest = array[0];

		int index = 0;

		for(int count = 1; count < array.length; count++){
			if(array[count] < smallest){
				smallest = array[count];
				index = count;
			}
		}
	return index;
	}
}