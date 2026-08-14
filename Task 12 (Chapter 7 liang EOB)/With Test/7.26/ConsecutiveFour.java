public class ConsecutiveFour {

	public static int [] sortArrayOf(int [] arrayOfNumbers){
        
        int store = 0;
        
        for(int count = 0; count < arrayOfNumbers.length; count++){
            for(int counter = 0; counter < arrayOfNumbers.length; counter++){
                if(arrayOfNumbers[count] < arrayOfNumbers[counter]){
                    store = arrayOfNumbers[counter];
                    arrayOfNumbers[counter] = arrayOfNumbers[count];
                    arrayOfNumbers[count] = store;
                }
            }
                
        }
        
    return arrayOfNumbers;
    }
    
}
