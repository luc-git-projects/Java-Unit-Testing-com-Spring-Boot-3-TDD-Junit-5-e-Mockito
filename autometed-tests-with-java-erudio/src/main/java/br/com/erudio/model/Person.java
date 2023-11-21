package br.com.erudio.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class Person implements Serializable{
    
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private Gender gender;

    public Person(Long id, String firstName, String lastName, String email, String address, Gender gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String email, String address, Gender gender) {
        this(null, firstName, lastName, email, address, gender);
    }
   
    
    @Override
    public Person clone(){
        Person person = new Person(id, firstName, lastName, email, address, gender);
        return person;
    }
    
}