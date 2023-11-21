package br.com.erudio.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Gender {
    MALE("Male"),
    FEMALE("Female");
    
    private String sex;
}
