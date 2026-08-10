public class WhileLoop {
    public static void main(String[]args){

        int a = -1;
        int count = 0;
        int b;
        int c;
      
        System.out.println("number square cube");
        // System.out.printf("%d  %d   %d%n", 0, 0, 0);

        while(count < 11){
            a = a + 1; 
            b = a * a;
            c = a * a * a;
            count++; 

            System.out.printf("%d  %d   %d%n", a , b, c);
        }
        
    }
}
