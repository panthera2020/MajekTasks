//Question 72

public class TraceLoopTwo {
    public static void main(String[] args) {
        
        for(int count = 1; count <= 5; count++){
            if(count %2 ==0)System.out.println(count + "is even");
            else System.out.println(count + "is odd");
        }
    }
}

/* PRINT OUT
1is odd
2is even
3is odd
4is even
5is odd
*/
