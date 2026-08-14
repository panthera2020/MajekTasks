import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAverageAnArray{

	@Test
	void testThatIfIEnterAnArrayOfIntegersIGetTheAverage(){
		//Given
		int [] arrayOfNumbers = {2,4,6,8,10};

		//When
		int expectedAverage = AverageAnArray.average(arrayOfNumbers);

		int actualAverage = 6;

		//
		assertEquals(expectedAverage, actualAverage);
	}

	@Test
	void testThatIfIEnterAnArrayOfDoubleIGetTheAverage(){
		//Given
		double [] arrayOfNumbers = {2.2,4.4,6.6,8.8,10.1};

		//When
		double expectedAverage = AverageAnArray.average(arrayOfNumbers);

		double actualAverage = 6.42;

		//
		assertEquals(expectedAverage, actualAverage);
	}
}