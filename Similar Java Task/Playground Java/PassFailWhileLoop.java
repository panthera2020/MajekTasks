import java.util.Scanner;
    public class PassFailWhileLoop{
        public static void main(String[]args){
            Scanner input = new Scanner(System.in);

            int passes = 0;
            int fails = 0;
            int counter = 0;

            while(counter < 10){
                System.out.println("Enter 1 for pass, Enter 2 for fail: ");
                int result = input.nextInt();

                if(result > 2){
                    System.out.println("Invalid");
                    System.exit(0);
                }
                else{
                    if(result == 1){
                        passes++;
                    }
                    else{
                        fails++;
                    }

                }
                
                counter++;
            }

            System.out.printf("Passed: %d  Failed: %d%n", passes, fails);

            if(passes > 7){
                System.out.println("Instructor deserves a bonus");
            }


                    //             public class Mystery {
                    // public static void main(String[] args) {
                    // int x = -2;
                    // int total = 0;
                    
                    // while (x <= 10) {
                    // int y = x + 2;
                    // x++;
                    // total += y;
                    // System.out.printf("Y is: %d and total is %d\n", y, total);
                    //  }// end while
                    
                    //  }// end main
                    //  } // end class Mystery

        }
    }
