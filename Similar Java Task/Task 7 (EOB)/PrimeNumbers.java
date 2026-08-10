public class PrimeNumbers {
    public static void main(String[] args) {
        
        int num = 1;
        int factor = 1; 
        int primeCounter = 0;

        for(num = 2; num <= 1200; num++){

            primeCounter = 0;
            for(factor = 1; factor <= num; factor++){
                if(num % factor == 0){
                    primeCounter++;
                }
            }

            if(primeCounter == 2){
                System.out.print(num + " ");
            }
        }
    }
}
