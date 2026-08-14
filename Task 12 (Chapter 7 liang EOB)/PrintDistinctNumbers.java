import java.util.Scanner;


public class PrintDistinctNumbers {
	
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
    
   
   public static int countDuplicateNumbersIn(int [] arrayOfNumbers){
       
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

   public static void main(String... args){
        Scanner input = new Scanner(System.in);
        int [] arrayOfNumbers = new int[10];

        System.out.println("Enter ten number: ");
        for(int count = 0; count < arrayOfNumbers.length; count++){
            arrayOfNumbers[count] = input.nextInt();
        }

    int [] distinctNumber = arrayOfDistinctNumbersIn(arrayOfNumbers);

    System.out.println("The number of distinct number is " + countDistinctNumbers(arrayOfNumbers));
    System.out.print("The distinct numbers are: ");

    for(int count = 0; count < distinctNumber.length; count++){
        System.out.print( distinctNumber[count] + " ");
    }
   }
}