// Question 61

public class AsterixPrintLoop {
    public static void main(String[] args) {
        
        int count = 0;
        int star = 0;

        for(count = 0; count <= 5; count++){
           for(star = 0; star < count; star++){
             System.out.print("*");
           }
            System.out.print(" ");
        }
    }
}
