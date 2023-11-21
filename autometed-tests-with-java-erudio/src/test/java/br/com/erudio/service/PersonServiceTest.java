package br.com.erudio.service;

import br.com.erudio.model.Gender;
import br.com.erudio.model.Person;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonServiceTest {
    
    private Person person;
    
    
    @BeforeEach
    public void setup(){
        
        person = new Person(22L, "Keith", "Moon", "kmoon@erudio.com.br", "Wembley - UK", Gender.MALE);
    }
    
    @DisplayName("When Create a person with sucess should return a Person")
    @Test
    public void testCreatePerson_WhenSucess_ShouldReturnPersonObject(){
        
        //Given  /Arrange
        
        PersonService service = new PersonServiceImpl();
        
        //When  / Act
        
        Person actual = service.createPerson(person);
        
        //Then  / Assert
        
        assertNotNull(actual, () -> "The createPerson() should not have returned null");
    }
    
    
    @DisplayName("When Create a person with sucess should contains firstName in return a Person oject")
    @Test
    public void testCreatePerson_WhenSucess_ShouldContainsFirstNameInReturnedPersonObject(){
        
        //Given  /Arrange
        
        PersonService service = new PersonServiceImpl();
        
        //When  / Act
        
        Person actual = service.createPerson(person);
        
        //Then  / Assert
        
        assertEquals(person.getFirstName(), actual.getFirstName(), () -> "The firsName is different");
    }
    
    
    @DisplayName("When Create a person with sucess should contains Id in return a Person oject")
    @Test
    public void testCreatePerson_WhenSucess_ShouldContainsIdInReturnedPersonObject(){
        
        //Given  /Arrange
        
        PersonService service = new PersonServiceImpl();
        
        //When  / Act
        
        Person actual = service.createPerson(person);
        
        //Then  / Assert
        
        assertEquals(person.getId(), actual.getId(), () -> "The id is different");
    }
    
    
     @DisplayName("When Create a person without email should throw IllegaArgumentException")
    @Test
    public void testCreatePerson_WhithNullEmail_ShouldThrowIllegalArgumentException(){
        
        //Given  /Arrange
        PersonService service = new PersonServiceImpl();
        person.setEmail(null);
        
        String expectedMessage = "The person email is null";
        
        //Then  / Assert
         IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> service.createPerson(person), 
                 () -> "Empty email should have cause an IllegalArgumentException");
         
         assertEquals(expectedMessage, exception.getMessage(), ()-> "The message must be equal");
    }
        

}