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
}