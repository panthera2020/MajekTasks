import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CreditCardVerificationTest {

	@Test 
	void testIfTheNumberInputedByTheUserIsAValidCardFromNumberOfDigit(){
		//Given
		long inputedDigit = 53998338564323456l;

		//When
		boolean expectedResult =  CreditCardVerification.isDigitsValidCard(inputedDigit);

		boolean actualResult = false;

		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testIfTheCardIsValidForTheCategoryOfTheCardFromTheFirstDigits(){
		//Given 
		long inputedDigit = 43998338564326l;

		//When
		boolean expectedResult = CreditCardVerification.isCardTypeValidCard(inputedDigit);

		boolean actualResult = true;

		//Check
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testIfForTheCardTypeIfTheCardIsValid(){
		//Given
		long inputedDigit = 3753647585763l;

		//When 
		String expectedResult = CreditCardVerification.typeOfCreditCard(inputedDigit);

		String actualResult = "American Express Card";

		//Check
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void testIfTheNumbersInputedPassTheFinalValidityTest(){
		//Given 
		long inputedDigit = 4388576018410707l;
		//When
		boolean expectedResult = CreditCardVerification.isCardValidTotatally(inputedDigit);

		boolean actualResult = true;

		//Check
		assertEquals(expectedResult, actualResult);

	}

	@Test
	void testForTheLengthOfTheCard(){
		//Given 
		long inputedDigit = 4388576018410707l;

		//When 
		int expectedResult = CreditCardVerification.lengthOfCardDigit(inputedDigit);

		int actualResult = 16; 

		//Check
		assertEquals(expectedResult, actualResult);
	}
}