public class ConsecutiveFour {    
   
   public static boolean isConsecutiveFour(int [] arrayOfNumbers){
       
       int duplicateCounter = 0;
       int store = 0;
       boolean isElementConsecutiveOfFour = false;
       
       for(int count = 0; count < arrayOfNumbers.length; count++){
               duplicateCounter = 0;
           for(int counter = 0; counter < arrayOfNumbers.length; counter++){
               if(arrayOfNumbers[count] == arrayOfNumbers[counter] && arrayOfNumbers[count] != store){
                   duplicateCounter++;
               }
           }
           if(duplicateCounter >= 4){
               isElementConsecutiveOfFour = true;
               store = arrayOfNumbers[count];
           }
               
       }
       
   return isElementConsecutiveOfFour;
   }
}
