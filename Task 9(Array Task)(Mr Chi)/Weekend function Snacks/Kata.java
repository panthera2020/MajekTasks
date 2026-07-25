public class Kata {

	public static boolean isEven(int number){
		boolean evenOrNot = true;
		if(number % 2 == 0){
			evenOrNot = true;
		}else{
			evenOrNot = false;
		}

	return evenOrNot;
	}

	public static boolean isPrime(int number){
		int primeCounter = 0;
		boolean primeOrNot = true;

		for(int count = 1; count <= number; count++){
			if(number % count == 0){
				primeCounter++;
			}
		}

		if(primeCounter == 2){
			primeOrNot = true;
		}else{
			primeOrNot = false;
		}

	return primeOrNot;
	}

	public static int sub(int firstNumber, int secondNumber){
		int substract = 0;

		if(secondNumber > firstNumber){
			substract = secondNumber - firstNumber;
		}else{
			substract = firstNumber - secondNumber;
		}

	return substract;
	}

	public static float div(int firstNumber, int secondNumber){
		float divide = 0;

		if(secondNumber == 0){
			divide = 0;
		}else{
			divide = (float) firstNumber / secondNumber;
		}

	return divide;
	}

	public static int fact(int number){
		int factorCounter = 0;

		for(int count = 1; count <= number; count++){
			if(number % count == 0){
				factorCounter++;
			}
		}

	return factorCounter;
	}

	public static boolean isSquare(int number){
		float squareRootOfNumber = (float) Math.pow(number, 0.5);
		boolean isSquareNumber = true;

		if(squareRootOfNumber % 1 == 0){
			isSquareNumber = true;
		}else{
			isSquareNumber = false;
		}

	return isSquareNumber;
	}

	public static boolean isPal(int number){
		int firstNumber = (number / 10000) % 10;
		int secondNumber = (number / 1000) % 10;
		int fourthNumber = (number / 10) % 10;
		int fifthNumber = number % 10;
		boolean isNumberPalindrome = true;

		if(firstNumber == fifthNumber && secondNumber == fourthNumber){
			isNumberPalindrome = true;
		}else{
			isNumberPalindrome = false;
		}

	return isNumberPalindrome;
	}

	public static long factorial(int number){
		long product = 1;

		for(int count = number; count >= 1; count--){
			product *= count;
		}

	return product;
	}

	public static long square(int number){
		long numberSquare = number * number;
		return numberSquare;
	}
	
}