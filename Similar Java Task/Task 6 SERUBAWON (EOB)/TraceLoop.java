//Question 56

public class TraceLoop {
    public static void main(String[] args) {
        int count = 0;
        int counter = 1;

        while(counter <=20){
            if(counter % 3 == 0){
                count++;
            }
        counter++;
        }

        System.out.println(count);
        System.out.println(counter);
    }
}

// count = 6
// counter = 21 