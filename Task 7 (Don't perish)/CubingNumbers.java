/* Question 1
(Cubing a Number) Write a method that takes an integer and returns its cube. For
example, given 3, the method should return 27. Incorporate the method into an application
that reads a value from the user and displays the result.*/

 public class CubingNumbers {
 	public static int isCube(int n){
 		int cube = n * n * n;
 		return cube;
 	}

 	public static void main(String[]args){
 		int cubeOfNumber = isCube(3);

 		System.out.println("Cube of 3 is " + cubeOfNumber);
 	}
 }