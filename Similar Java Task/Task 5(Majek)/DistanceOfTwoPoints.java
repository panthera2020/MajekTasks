//2.15 

/*
1 collect inputs x1,y1,x2,y2
2 create a variable for the inputs
3 calculate for the sides
4 print result
*/

import java.util.Scanner;

  public class DistanceOfTwoPoints {
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);

      System.out.println("Enter x1 and y1: ");
      double xOne = input.nextDouble();
      double yOne = input.nextDouble();

      System.out.println("Enter x2 and y2: ");
      double xTwo = input.nextDouble();
      double yTwo = input.nextDouble();
      

      double distanceOfTwoPoints = Math.pow((Math.pow(xTwo - xOne, 2)) + (Math.pow(yTwo - yOne, 2)), 0.5);

      System.out.println("The distance between the two points is " + distanceOfTwoPoints);
      
    }
  }