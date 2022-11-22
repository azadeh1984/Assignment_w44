package se.lexicon.dao;

import se.lexicon.Person;

import java.util.List;

public interface PersonDao {
    Person persist(Person person);
    Person findById(int id);
    Person findByEmail(String email);
    List<Person> findAll();
    void remove(int id);
}

