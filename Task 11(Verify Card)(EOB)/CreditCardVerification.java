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


	public static boolean isCardTypeValidCard(long integers){
		String integersToString = integers + "";

		boolean isCardTypeValid = true;

		char first = integersToString.charAt(0);
		char second = integersToString.charAt(1);

		if(isDigitsValidCard(integers) && (first == '4' || first == '5' || first == '6'|| (first == '3' && second == '7'))){
			isCardTypeValid = true;
		}else{
			isCardTypeValid = false;
		}

		return isCardTypeValid;
	}

	public static String typeOfCreditCard(long integers){
		String integersToString = integers + "";

		char first = integersToString.charAt(0);
		char second = integersToString.charAt(1);

		String cardType = "";

		if(isCardTypeValidCard(integers) && (first == '4')){
			cardType = "Visa Card";
		}else if(isCardTypeValidCard(integers) && (first == '5')){
			cardType = "Master Card";
		}else if(isCardTypeValidCard(integers) && (first == '6')){
			cardType = "Discover Card";
		}else if(isCardTypeValidCard(integers) && (first == '3' && second == '7')){
			cardType = "American Express Card";
		}else{
			cardType = "Invalid Card";
		}

		return cardType;
	}


	private static int sumOfDoubledSecondDigits(long integers){
		String integersToString = integers + "";

		int firstSum = 0;
		int doubled = 0;

		int innerFirstSum = 0;


			if(integersToString.length() % 2 == 0){
				for(int count = 0; count < integersToString.length(); count+= 2){
					int digitsPicked = Character.getNumericValue(integersToString.charAt(count));
					doubled = digitsPicked * 2;
					if(doubled >= 0 && doubled < 10){
						firstSum += doubled;
					}else if(doubled >= 10){
						int lastNumberInDoubled = doubled % 10;
						int firstNumberInDoubled = doubled / 10;

						innerFirstSum = lastNumberInDoubled + firstNumberInDoubled;

						firstSum += innerFirstSum;
					}
				}
			}else if(integersToString.length() % 2 != 0){
				for(int count = 1; count < integersToString.length(); count+= 2){
					int digitsPicked = Character.getNumericValue(integersToString.charAt(count));
					doubled = digitsPicked * 2;
					if(doubled >= 0 && doubled < 10){
						firstSum += doubled;
					}else if(doubled >= 10){
							int lastNumberInDoubled = doubled % 10;
							int firstNumberInDoubled = doubled / 10;

							innerFirstSum = lastNumberInDoubled + firstNumberInDoubled;

						firstSum += innerFirstSum;
					}
				}
			}
		return firstSum;
	}

	private static int sumOfRemainingDigits(long integers){
		String integersToString = integers + "";

		int secondSum = 0;

		if(integersToString.length() % 2 == 0){
			for(int count = 1; count < integersToString.length(); count+= 2){
				int digitsPicked = Character.getNumericValue(integersToString.charAt(count));
				secondSum += digitsPicked;
			}
		}else if(integersToString.length() % 2 != 0){
			for(int count = 0; count < integersToString.length(); count+= 2){
				int digitsPicked = Character.getNumericValue(integersToString.charAt(count));
				secondSum += digitsPicked;
			}
		}

		return secondSum;
	}


	static boolean isCardValidTotatally(long integers){
		boolean isCardTotallyValid = true;

		int totalSumOfSecondDigitAndRemainingDigits = 0;

		if(isCardTypeValidCard(integers)){
			totalSumOfSecondDigitAndRemainingDigits = sumOfDoubledSecondDigits(integers) + sumOfRemainingDigits(integers);
			if(totalSumOfSecondDigitAndRemainingDigits % 10 == 0){
				isCardTotallyValid = true;
			}else if(totalSumOfSecondDigitAndRemainingDigits % 10 != 0){
				isCardTotallyValid = false;
			}
		}else{
			isCardTotallyValid = false;
		}

	return isCardTotallyValid;
	}

	public static int lengthOfCardDigit(long integers){
		String numberofDigits = integers + "";

		return numberofDigits.length();
	}
}