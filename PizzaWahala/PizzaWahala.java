public class PizzaWahala{

	public int noOfBox(int number, String pizzaType){

		int numberOfBox = 0;

		if(pizzaType.equalsIgnoreCase("odogwu")){
			numberOfBox = (int)Math.ceil((double)number / 12); 
		}
		if(pizzaType.equalsIgnoreCase("big boys")){
			numberOfBox = (int)Math.ceil((double)number / 8); 
		}
		if(pizzaType.equalsIgnoreCase("small money")){
			numberOfBox = (int)Math.ceil((double)number / 6); 
		}
		if(pizzaType.equalsIgnoreCase("sapa size")){
			numberOfBox = (int)Math.ceil((double)number / 4); 
		}

	return numberOfBox;
	}

	public int noOfSlice(int number, String pizzaType){
		int numberOfSlices = 0;

		if(pizzaType.equalsIgnoreCase("odogwu")){
			numberOfSlices = (noOfBox(number,pizzaType) * 12) - number; 
		}
		if(pizzaType.equalsIgnoreCase("big boys")){
			numberOfSlices = (noOfBox(number,pizzaType) * 8) - number; 
		}
		if(pizzaType.equalsIgnoreCase("small money")){
			numberOfSlices = (noOfBox(number,pizzaType) * 6) - number; 
		}
		if(pizzaType.equalsIgnoreCase("sapa size")){
			numberOfSlices = (noOfBox(number,pizzaType) * 4) - number; 
		}

	return numberOfSlices;

	}

	public int priceOfBox(int number, String pizzaType){
		int totalPriceOfBox = 0;
		
		if(pizzaType.equalsIgnoreCase("odogwu")){
			totalPriceOfBox = noOfBox(number,pizzaType) * 5200; 
		}
		if(pizzaType.equalsIgnoreCase("big boys")){
			totalPriceOfBox = noOfBox(number,pizzaType) * 4000; 
		}
		if(pizzaType.equalsIgnoreCase("small money")){
			totalPriceOfBox = noOfBox(number,pizzaType) * 2900; 
		}
		if(pizzaType.equalsIgnoreCase("sapa size")){
			totalPriceOfBox = noOfBox(number,pizzaType) * 2500; 
		}

	return totalPriceOfBox;
	}
}