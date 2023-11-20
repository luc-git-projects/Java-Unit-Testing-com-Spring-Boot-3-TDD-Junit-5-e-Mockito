package br.com.erudio.math;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@Order(2)
@TestMethodOrder(MethodOrderer.MethodName.class)
public class MethodOrderedByName {
    
    
    @Test
    public void testeC(){
        System.out.println("Runnint Test C");
    }
    
    @Test
    public void testeD(){
        System.out.println("Runnint Test D");
    }
    
    @Test
    public void testeA(){
        System.out.println("Runnint Test A");
    }
    
    @Test
    public void testeB(){
        System.out.println("Runnint Test B");
    }
    
    

}