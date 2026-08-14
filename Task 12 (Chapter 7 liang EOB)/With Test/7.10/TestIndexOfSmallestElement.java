import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestIndexOfSmallestElement {

	@Test 
	void testThatWhenIEnterAnArrayOfDoubleIGetTheIndexOfSmallestElementInArray(){
		//Given
		double [] doubleArray = {1.9,2.5,3.7,2, 1.5,6,3,4,5,2};

		//When
		int expectedIndexOfSmallestElement = IndexOfSmallestElement.indexOfSmallestElement(doubleArray);

		int actualIndexOfSmallestElement = 4;

		//Check
		assertEquals(expectedIndexOfSmallestElement, actualIndexOfSmallestElement);
	}
}