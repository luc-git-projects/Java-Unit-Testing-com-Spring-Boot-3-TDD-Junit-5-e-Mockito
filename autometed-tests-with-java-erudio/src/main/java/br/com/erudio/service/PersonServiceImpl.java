package br.com.erudio.service;

import br.com.erudio.model.Person;

public class PersonServiceImpl implements PersonService{

    @Override
    public Person createPerson(Person person) {
        
        if(person.getEmail() ==  null || person.getEmail().isBlank()){
            throw new IllegalArgumentException("The person email is null");
        }
        return person.clone();
    }

}