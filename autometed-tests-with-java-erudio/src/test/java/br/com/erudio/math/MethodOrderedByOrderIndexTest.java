package br.com.erudio.math;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;

@Order(3)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrderIndexTest {
    
    StringBuilder actualValue = new StringBuilder("");
    
    @AfterEach
    public void afterEach(){
        System.out.println("The actual value is " + actualValue);
    }
    
    
    @Test
    @Order(1)
    public void testeC(){
        System.out.println("Runnint Test C");
        actualValue.append(1);
    }
    
    @Test
    @Order(2)
    public void testeD(){
        System.out.println("Runnint Test D");
        actualValue.append(2);
    }
    
    @Test
    @Order(3)
    public void testeA(){
        System.out.println("Runnint Test A");
        actualValue.append(3);
    }
    
    @Test
    @Order(4)
    public void testeB(){
        System.out.println("Runnint Test B");
        actualValue.append(4);
    }
    
    

}