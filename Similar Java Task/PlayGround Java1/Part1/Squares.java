// start counting from 1 through to 20
// use math.pow to find then square of each number

public class Squares {
	public static void main(String[]args){
	
		for(int counter = 1; counter <= 20; counter++){
			
			int square = (int)Math.pow(counter, 2);
			System.out.print(square);
			System.out.print(" ");
		}
	}
}