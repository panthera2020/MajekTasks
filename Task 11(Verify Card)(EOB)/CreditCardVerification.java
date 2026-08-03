public class CreditCardVerification {

	public static boolean isDigitsValidCard(long integers){
		int counter = 0;
		boolean isCreditCardValid = true;

		while(true){
			long numbersInIntegers = integers % 10;

			counter++;

			integers /= 10;

			if(integers == 0){
				break;
			}

		}

		if(counter >= 13 && counter <= 16){
			isCreditCardValid = true;
		}else{
			isCreditCardValid = false;
		}


		return isCreditCardValid;
	}
}