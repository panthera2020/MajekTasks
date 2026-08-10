public class PrimeNumberLoop {
    public static void main(String[] args) {
        
        int count = 2;
        for(count = 2; count <= 50; count++){
            if(count / 1 == count && count / count == 1 && count % 6 != 0){
                System.out.println(count + " ");
            }
        }
    }
}
