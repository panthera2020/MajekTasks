import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMergerTwoSortedList {
    
    @Test
    void testThatWhenIEnterTwoArraysIGetOneArrayThatIsMergedAndSorted(){
        //Given
        int [] firstArray = {5,1,5,16,61,111};
        
        int [] secondArray = {4,2,4,5,6};
        
        //When
        int [] expectedMergedSortedArray = MergerTwoSortedList.merge(firstArray,secondArray);
        
        int [] actualMergedSortedArray = {1,2,4,5,5,6,16,61,111};
        
        //Check
        assertArrayEquals(expectedMergedSortedArray, actualMergedSortedArray);
    }
} 
