public class IdenticalArray {
    public static boolean isArrayIdentical(int [] firstArray, int [] secondArray){
        
        boolean isIdentical = true;
        
        if(firstArray.length != secondArray.length){
            isIdentical = false;
        }else{
            for(int count = 0, index = 0; count < firstArray.length; count++,index++){
                if(firstArray[count] != secondArray[index]){
                    isIdentical = false;
                }
            }
        }
        
    return isIdentical;
    }
}
