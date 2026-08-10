public class ExampleOne {
    public static void main(String[]args){

        int a = 10;
        int sum = 0;

        for(int counter = 10; counter <= 20; sum = a + counter,counter++){
            a = sum;
        }

        System.out.printf("Total sum: %d%n", sum);
    }
}
