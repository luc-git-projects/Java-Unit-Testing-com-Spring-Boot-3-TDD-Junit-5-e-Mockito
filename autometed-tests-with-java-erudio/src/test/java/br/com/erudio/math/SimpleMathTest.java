package br.com.erudio.math;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static java.lang.String.format;
import org.junit.jupiter.api.DisplayName;


public class SimpleMathTest {
    
    private SimpleMath math;
    
    public SimpleMathTest() {
    }
    
    @BeforeAll
    public static void setup() {
        System.out.println("Running @BeforeAll method");
    }
    
    @AfterAll
    public static void cleanup() {
        System.out.println("Running @AfterAll method");
    }
    
    @BeforeEach
    public void beforeEachMethod() {
        math = new SimpleMath();
        System.out.println("Runnig @BeforeEach method!");
    }
    
    @AfterEach
    public void afterEachMethod() {
        System.out.println("Runnig @afterEach method!");
    }

    /**
     * Test of sum method, of class SimpleMath.
     */
    @Test
    @DisplayName("Test of sum of two numbers")
    public void testSum() {
        System.out.println("Test 6.2 + 2 = 8.2");
        
        //Given
        Double firstNumber = 6.2;
        Double secondNumber = 2D;
        Double expected = 8.2;
        Double actual = math.sum(firstNumber, secondNumber);
        
        //When
        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected);
        
        //Then
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    /**
     * Test of subtraction method, of class SimpleMath.
     */
    @Test
    @DisplayName("Test of subtraction of two numbers")
    public void testSubtraction() {
        
        System.out.println("Test 6.2 - 2 = 4.2");
        
        //Given
        Double firstNumber = 6.2;
        Double secondNumber = 2D;
        Double expected = 4.2;
        
        //When
        Double actual = math.subtraction(firstNumber, secondNumber);
       
        //Then
        assertEquals(expected, actual, () -> format("%.2f - %.2f did not produce %.2f", firstNumber, secondNumber, expected));
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
        
    }

    /**
     * Test of multiplication method, of class SimpleMath.
     */
    @Test
    @DisplayName("Test of multiplication of two numbers")
    public void testMultiplication() {
        
        
        System.out.println("Test 6.2 * 2 = 12.4");
        
        //Given
        Double firstNumber = 6.2;
        Double secondNumber = 2D;
        Double expected = 12.4;
        
        //When
        Double actual = math.multiplication(firstNumber, secondNumber);
       
        //Then
        assertEquals(expected, actual, () -> format("%.2f * %.2f did not produce %.2f", firstNumber, secondNumber, expected));
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }

    /**
     * Test of division method, of class SimpleMath.
     */
    @Test
    @DisplayName("Test of division of two numbers")
    public void testDivision() {
        
        System.out.println("Test 6.2 / 2 = 3.1");
        
        //Given
        Double firstNumber = 6.2;
        Double secondNumber = 2.0;
        Double expected = 3.1;
        
        //When
        Double actual = math.division(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual, () -> format("%.2f / %.2f did not produce %.2f", firstNumber, secondNumber, expected));
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
    
    
    @Test
    @DisplayName("Test of division by zero")
    public void testDivisionByZero(){
        
        double firstNumber = 6;
        double secondNumber = 2;
        
        String expectedMessage = "Impossible to divide by zero";
                
                 //When & then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");
        
        assertEquals(expectedMessage, actual.getMessage(), () -> "Unexpected exception message!");
        
    }

    /**
     * Test of mean method, of class SimpleMath.
     */
    @Test
    @DisplayName("Test of mean of two numbers")
    public void testMean() {
        
        System.out.println("Test (6.2 + 2) / 2 = 4.1");
        
        //Given
        Double firstNumber = 6.2;
        Double secondNumber = 2D;
        Double expected = 4.1;
        
        //When
        Double actual = math.mean(firstNumber, secondNumber);
        
        //Then
        assertEquals(expected, actual, () -> format("The mean between the numbers %.2f and %.2f did not produce %.2f", firstNumber, secondNumber, expected));
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }
    
    
    @Test
    @DisplayName("Test of square root of a number")
    public void testSquareRoot() {
        
        System.out.println("Test square root of 9 = 4.1");
        
        //Given
        SimpleMath math = new SimpleMath();
        Double number = 9.0;
        Double expected = 3.0;
        
        //When
        Double actual = math.squareRoot(number);
        
        //Then
        assertEquals(expected, actual, () -> format("The square root of  the number %.2f did not produce %.2f", number, expected));
        assertNotEquals(9.2, actual);
        assertNotNull(actual);
    }  
}
