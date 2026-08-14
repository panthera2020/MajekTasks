import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class StatisticsCalculatorTest{
	
	@Test
	public void testThatFromAnArayOfNumbersTheCorrectRangeOfTheArrayIsCorrect(){

	//Given
	int [] numbers = {3, 5, 7,1, 25, 11, 0};

	//When
	int expectedRange = StatisticsCalculator.calculateRangeOf(numbers);

	int actualRange = 25;

	//Check
	assertEquals(actualRange, expectedRange);



	}
	
	@Test 
	void testThatFromAnArrayOfNumberIHaveTheCorrectMeanNumber(){

		//Given
		int [] numbers = {3, 5, 7,1, 25, 11, 0};

		//When
		double expectedMean = StatisticsCalculator.calculateMeanOf(numbers);

		double actualMean = 7.0;

		//Check
		assertEquals(expectedMean, actualMean);
	}

	@Test
	void testThatFromAnArrayOfNumberIHaveTheCorrectMedianNumberFromTheArrayWhenTheLengthIsEven(){
		//Given
		int [] numbers = {3, 4, 7,1, 25, 11, 0, 6};

		//When
		int expectedMedian = StatisticsCalculator.calculateMedianOf(numbers);

		int actualMedian = 5;

		//Check
		assertEquals(expectedMedian, actualMedian);

	}

	@Test
	void testThatFromAnArrayOfNumberIHaveTheCorrectMedianNumberFromTheArrayWhenTheLengthIsOdd(){
		//Given
		int [] numbers = {3, 5, 7,1, 25, 11, 0};

		//When
		int expectedMedian = StatisticsCalculator.calculateMedianOf(numbers);

		int actualMedian = 5;

		//Check
		assertEquals(expectedMedian, actualMedian);

	}

	@Test
	void testThatFromAnArrayOfNumberIHaveTheModeIsCorrect(){
		//Given
		int [] numbers = {3, 4, 7,1, 25, 11, 0, 11, 11, 4};

		//When
		int expectedMode = StatisticsCalculator.calculateModeOf(numbers);

		int actualMode = 11;

		//Check
		assertEquals(expectedMode, actualMode);

	}

	@Test
	void testThatFromAnArrayOfNumbersIHaveTheDeviationIsCorrect(){
		//Given
		int [] numbers = {3, 5, 7, 1, 25, 11, 4, 6};

		//When
		double [] expectedDeviation = StatisticsCalculator.calculateDeviationOf(numbers);

		double [] actualDeviation = {-5, -3, -1, -7, 17, 3, -4, -2};

		//Check
		assertArrayEquals(expectedDeviation, actualDeviation);
	}

	@Test
	void testThatFromAnArrayOfNumbersIHaveTheMeanDeviationIsCorrect(){
		//Given
		int [] numbers = {3, 5, 7, 1, 25, 11, 4, 6};

		//When
		double expectedMeanDeviation = StatisticsCalculator.calculateMeanDeviationOf(numbers);
		double actualMeanDeviation = 5.25; 

		//Check 
		assertEquals(expectedMeanDeviation, actualMeanDeviation);
	}

	@Test
	void testThatFromAnArrayOfNumbersIHaveTheVarianceIsCorrect(){
		//Given
		int [] numbers = {3, 5, 7, 1, 25, 11, 4, 6};

		//When
		double expectedVariance = StatisticsCalculator.calculateVarianceOf(numbers);
		double actualVariance = 50.25; 

		//Check 
		assertEquals(expectedVariance, actualVariance);
	}

	@Test
	void testThatFromAnArrayOfNumbersIHaveTheStandardDeviationIsCorrect(){
		//Given
		int [] numbers = {3, 5, 7, 1, 25, 11, 4, 6};

		//When
		double expectedStandardDeviation = StatisticsCalculator.calculateStandardDeviationOf(numbers);
		double actualStandardDeviation = 7; 

		//Check 
		assertEquals(expectedStandardDeviation, actualStandardDeviation);
	}

	@Test
	void testThatFromAnArrayOfNumbersIHaveTheCoefficientOfVarianceIsCorrect(){
		//Given
		int [] numbers = {3, 5, 7, 1, 25, 11, 4, 6};

		//When
		double expectedCoefficientOfVariance = StatisticsCalculator.calculateCoefficientOfVarianceOf(numbers);
		double actualCoefficientOfVariance = 87.5; 

		//Check 
		assertEquals(expectedCoefficientOfVariance, actualCoefficientOfVariance);
	}
}