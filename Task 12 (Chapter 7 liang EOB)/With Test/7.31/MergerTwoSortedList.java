public class MergerTwoSortedList {

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

   public static int countDistinctNumbers(int [] arrayOfNumbers){
   		int duplicateCounter = 0;
       	int theCount = 0;
       	int store = 0;
       	int numberOfDistinct = 0;
       	int [] sortArray = sortArrayOf(arrayOfNumbers);
       
       	for(int count = 0; count < sortArray.length; count++){
               duplicateCounter = 0;
           for(int counter = 0; counter < sortArray.length; counter++){
               if(sortArray[count] == sortArray[counter] && sortArray[count] != store){
                   duplicateCounter++;
               }
            }
            if(duplicateCounter > 0){
                numberOfDistinct++;
            }
            if(duplicateCounter > 1){
                  store = sortArray[count];

            }
       }
    return numberOfDistinct;
   }

   public static int [] arrayOfDistinctNumbersIn(int [] arrayOfNumbers){
        int [] newArray = new int[countDistinctNumbers(arrayOfNumbers)];
        int store = 0;
        int index = 0;
        int duplicateCounter = 0;
        int [] sortArray = sortArrayOf(arrayOfNumbers);

        for(int count = 0; count < sortArray.length; count++){
                duplicateCounter = 0;
            for(int counter = 0; counter < sortArray.length; counter++){
                if(sortArray[count] == sortArray[counter] && sortArray[count] != store){
                   duplicateCounter++;
               }
               if(sortArray[count] == sortArray[counter] && sortArray[count] != store && duplicateCounter == 1){
                    newArray[index] = sortArray[count];
                    index++;
                }
            }
            if(duplicateCounter > 1){
                store = sortArray[count];
            }
            if(index == newArray.length){
                break;
            }
        }
    return newArray;
   }
    
    public static int[] merge(int[] listOne, int[] listTwo){
        int [] noDuplicateOne = arrayOfDistinctNumbersIn(listOne);
        int [] noDuplicateTwo = arrayOfDistinctNumbersIn(listTwo);
        
        int [] newArray = new int[(noDuplicateOne.length) + (noDuplicateTwo.length)];
        
        int index = noDuplicateOne.length;
        
        for(int count = 0; count < noDuplicateOne.length; count++){
            newArray[count] = noDuplicateOne[count];
        }
        
        for(int counter = 0; counter < noDuplicateTwo.length; counter++){
            newArray[index] = noDuplicateTwo[counter];
            index++;
        }
        
        int [] sortedArray = sortArrayOf(newArray);

        
    return sortedArray;
    }
}
