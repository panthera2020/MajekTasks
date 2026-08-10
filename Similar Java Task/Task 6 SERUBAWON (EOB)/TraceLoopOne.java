//Question 64

public class TraceLoopOne {
    public static void main(String[] args) {

        int number = 3;
        
        for(int count = 1; count < number; count++){
            for(int subCount = 1; subCount <= count; subCount++){
                System.out.print(subCount + " ");
            }

            System.out.println();
        }
    }
}

// print out
// 1
// 2
//
// end.