package br.com.erudio.math;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class ArraysCompareTest {
    
    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    public void testSortPerformance(){
        
        Integer [] numbers = {25, 8, 21, 32, 3};
        Integer [] expected = {3, 8, 21, 25, 32};
        
        for (int i = 0; i < 100; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }       
        
    }

}