/* Question 50
1 Initialize counter to zero
2 increase counter by 1
3 Intialize sum to zero and add count to each iteration
4 print Sum
*/

public class LoopSumOfIntegers {
    public static void main(String[]args){
    
        int count = 0;
        int sum = 0;

        for(count = 0; count <= 100; count++){
            sum += count;
        }

        System.out.print("Sum: " + sum);
    }
}
