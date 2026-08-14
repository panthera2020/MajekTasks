import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIdenticalArray {
    
    @Test
    void testThatWhenIEnterTwoArrayItReturnsTrueIfTheyAreSimilar(){
        //Given
        int [] arrayOfNumbersOne = {5,2,5,6,1,6};
        
        int [] arrayOfNumbersTwo = {5,2,5,6,1,6};
        
        //When
        boolean expectedAnswer = IdenticalArray.isArrayIdentical(arrayOfNumbersOne, arrayOfNumbersTwo);
        
        boolean actualAnswer = true;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    @Test
    void testThatWhenIEnterTwoArrayItReturnsFalseIfTheyAreNotSimilar(){
        //Given
        int [] arrayOfNumbersOne = {5,2,5,6,6,1};
        
        int [] arrayOfNumbersTwo = {5,2,5,6,1,6};
        
        //When
        boolean expectedAnswer = IdenticalArray.isArrayIdentical(arrayOfNumbersOne, arrayOfNumbersTwo);
        
        boolean actualAnswer = false;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
    
    @Test
    void testThatWhenIEnterTwoArrayItReturnsFalseIfTheArraysAreOfDifferentLength(){
        //Given
        int [] arrayOfNumbersOne = {5,2,5,6,6,1};
        
        int [] arrayOfNumbersTwo = {5,2,5,6,6,1,5};
        
        //When
        boolean expectedAnswer = IdenticalArray.isArrayIdentical(arrayOfNumbersOne, arrayOfNumbersTwo);
        
        boolean actualAnswer = false;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
}
