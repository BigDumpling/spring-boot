package com.ligq.study.spring.demo.model;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Slf4j
@Data
public class People implements Validator {

    private String name;
    private int age;

    @Override
    public boolean supports(Class<?> clazz) {
        return People.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name can't be null");
        ValidationUtils.rejectIfEmpty(errors, "age", "age can't be null");
        People people = (People) target;
        if(people.getAge() < 0){
            errors.rejectValue("age", "age can't small than 0");
        } else if (people.getAge() > 110){
            errors.rejectValue("age", "too old");
        }
    }
}
