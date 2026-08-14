public class CountOccurenceOfNumbers {
	
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
    
   
   public static int checkDuplicateNumbersIn(int [] arrayOfNumbers){
       
       int duplicateCounter = 0;
       int theCount = 0;
       int store = 0;
       int [] sortArray = sortArrayOf(arrayOfNumbers);
       
       for(int count = 0; count < sortArray.length; count++){
               duplicateCounter = 0;
           for(int counter = 0; counter < sortArray.length; counter++){
               if(sortArray[count] == sortArray[counter] && sortArray[count] != store){
                   duplicateCounter++;
               }
           }
           if(duplicateCounter > 1){
               theCount++;
               store = sortArray[count];
           }
               
       }
       
   return theCount;
   }

   public static int countNumberOfElementsAndNoDuplicate(int [] arrayOfNumbers){
   		int duplicateCounter = 0;
       	int theCount = 0;
       	int store = 0;
       	int numberOfDigits = 0;
       	int [] sortArray = sortArrayOf(arrayOfNumbers);
       
       	for(int count = 0; count < sortArray.length; count++){
               duplicateCounter = 0;
           for(int counter = 0; counter < sortArray.length; counter++){
               if(sortArray[count] == sortArray[counter] && sortArray[count] != store && sortArray[count] != 0){
                   duplicateCounter++;
                   numberOfDigits++;
               }
           }
           if(duplicateCounter > 1){
               theCount++;
               store = sortArray[count];

           }
               
       }
    return numberOfDigits;
   }

   public static void main(String... args){
   	int [] numberArray = {2,5,6,5,4,3,23,43,2,0};

   	System.out.println(countNumberOfElementsAndNoDuplicate(numberArray));
   }
}