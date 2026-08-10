// Question 78

public class TraceCodeOne {
    public static void main(String[] args) {

        int total = 0;

        for(int count = 1; count <= 4; count++){
            if(count % 2 != 0)total += count;
        }

    System.out.println("Total: " + total);
    }
}

//PRINT OUT
// Total: 4 