/* Question 37
 The short circuit evalution is when the compiler skips the execution or evaluation of some sub-expressions in a logical expression. The compiler stops evaluating the further sub-expressions as soon as the value of the expression is determined.
*/

public class ShortCircuit {
        public static void main(String[] args) {
            
            int x = 1;

   		 if (x || ++x) {
    		    System.out.printf("%d", x);
   		 }
        }
}