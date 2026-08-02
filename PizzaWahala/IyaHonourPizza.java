// import PizzaWahala;

import java.util.Scanner;

public class IyaHonourPizza{
	public static void main(String... args){
		Scanner input = new Scanner(System.in);

		PizzaWahala pizza = new PizzaWahala();

		System.out.println("Welcome to Iya Honour Pizza...");

		System.out.println();

		System.out.println("How many guest do you have: ");
		int numberOfGuest = input.nextInt();

		input.nextLine();

		System.out.println();

		String pizzaType = """

		What pizza type do you want?

		-Odogwu
		-Big Boys
		-Small Money
		-Sapa size 

		Please type out the pizza type you want and press enter 

		""";

		System.out.println(pizzaType);
		String userPizzaType = input.nextLine().strip();

		System.out.println();

		System.out.println("Number of Boxes: " + pizza.noOfBox(numberOfGuest, userPizzaType));
		System.out.println("Number of left over slices after serving: " + pizza.noOfSlice(numberOfGuest, userPizzaType));
		System.out.println("Price: " + pizza.priceOfBox(numberOfGuest, userPizzaType));
	}
}