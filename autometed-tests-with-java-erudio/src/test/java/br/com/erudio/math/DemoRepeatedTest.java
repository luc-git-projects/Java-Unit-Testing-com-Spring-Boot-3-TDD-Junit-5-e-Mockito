package br.com.erudio.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class DemoRepeatedTest {
    
    SimpleMath math;
    
    @BeforeEach
    public void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Runnig @BeforeEach method!");
    }
    
    @RepeatedTest(value = 3, name = "{DisplayName}. Repetition " + "{currentRepetition} of {totalRepetition}!")
    @DisplayName("Test of division by zero")
    public void testDivisionByZero(RepetitionInfo repetitionInfo, TestInfo testInfo){
        
        System.out.println("Repetition number of times " + repetitionInfo.getCurrentRepetition() + " of " + repetitionInfo.getTotalRepetitions());
        
        double firstNumber = 6;
        double secondNumber = 0;
        
        String expectedMessage = "Impossible to divide by zero";
                
                 //When & then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");
        
        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
        
    }
    
    public void test(){
        fail("Not yet implemented");
    }

}