public class SmallestElement {

	public static double min(double[] array){
		double smallest = array[0];

		for(int count = 1; count < array.length; count++){
			if(array[count] < smallest){
				smallest = array[count];
			}
		}
	return smallest;
	}
}