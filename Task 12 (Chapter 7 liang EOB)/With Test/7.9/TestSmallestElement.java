import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSmallestElement {

	@Test 
	void testThatWhenIEnterAnArrayOfDoubleIGetTheSmallestElementInArray(){
		//Given
		double [] doubleArray = {1.9,2.5,3.7,2, 1.5,6,3,4,5,2};

		//When
		double expectedSmallestElement = SmallestElement.min(doubleArray);

		double actualSmallestElement = 1.5;

		//Check
		assertEquals(expectedSmallestElement, actualSmallestElement);
	}
}