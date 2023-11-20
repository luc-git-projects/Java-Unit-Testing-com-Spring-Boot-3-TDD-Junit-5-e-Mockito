package br.com.erudio.math;

import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import static org.junit.jupiter.params.provider.Arguments.of;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class SimpleMathTestS4 {
    
    private static SimpleMath math;
    
    @BeforeAll
    public static void setup() {
        math = new SimpleMath();
    }
    
    
    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Moon"})
    public void testValueSource(String firstName){
        System.out.println(firstName);
        Assertions.assertNotNull(firstName);
    }

    @DisplayName("Test 6.2 / 2 = 3.1")
    @ParameterizedTest
    @MethodSource("testDivisionInputParameters")
    public void testDivision(Double firstNumber, Double secondNumber, Double expected){
        
        Double actual = math.division(firstNumber, secondNumber);
        
        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
    }
    
    
    public static Stream<Arguments> testDivisionInputParameters(){
        return Stream.of(
                of(6.2, 2.0, 3.9),
                of(17.0, 2.0, 8.5),
                of(22.2, 2.0, 11.1)
        );
    }
    
    
    
    @ParameterizedTest
    /**
    @CsvSource({
        "6.2, 2, 3.1",
        "17, 2, 8.5",
        "18.0, 3.0, 6"
    })
    * **/
    
    @CsvFileSource(resources = "/testDivision.csv")
    public void testDivision2(Double firstNumber, Double secondNumber, Double expected){

        
        Double actual = math.division(firstNumber, secondNumber);
        
        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
    }
}