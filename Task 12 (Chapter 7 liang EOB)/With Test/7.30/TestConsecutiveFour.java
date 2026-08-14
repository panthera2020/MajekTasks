import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestConsecutiveFour {
    
    @Test
    void testTHatIfIEnterAnArrayThatHasConsecutiveFourNumbersItReturnsTrue(){
        //Given
        int [] arrayOfNumbers = {3,4,5,5,5,5,4,5};
        
        //When
        boolean expectedAnswer = ConsecutiveFour.isConsecutiveFour(arrayOfNumbers);
        
        boolean actualAnswer = true;
        
        //Check
        assertEquals(expectedAnswer, actualAnswer);
    }
}
