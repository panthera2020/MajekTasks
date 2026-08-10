public class TwinPrime {
    public static void main(String[] args) {
        
        int num = 1;
        int factor = 1; 
        int primeCounter = 0;
        int prime = 1;

        for(num = 2; num <= 1000; num++){

            primeCounter = 0;
            for(factor = 1; factor <= num; factor++){
                if(num % factor == 0){
                    primeCounter++;
                }
            }

            if(primeCounter == 2){

                if(num - prime == 2){
                    System.out.println(prime + " " + num);
                }
                prime = num;

            }
        }
    }
}
