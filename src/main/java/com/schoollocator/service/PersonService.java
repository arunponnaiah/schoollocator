package com.schoollocator.service;


import java.util.List;

import com.schoollocator.model.Person;

public interface PersonService {
    
    public void addPerson(Person person);
    public List<Person> listPeople();
    public void removePerson(Integer id);
}
