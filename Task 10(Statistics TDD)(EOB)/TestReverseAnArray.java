import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestReverseAnArray {

	@Test
	void testThatWhenIEnterAnArrayOfIntegersIGetAReversedOrderOfTheElements(){
		//Given 
		int [] arrayOfNumbers = {5,4,3,2,1};

		//When
		int [] expectedReversedArray = ReverseAnArray.reverseArray(arrayOfNumbers);

		int [] actualReversedArray = {1,2,3,4,5};

		//Check
		assertArrayEquals(expectedReversedArray, actualReversedArray);
	}
}