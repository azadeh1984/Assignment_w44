package se.lexicon.dao;

import se.lexicon.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonDAOCollectionImpl implements PersonDao{

    private List<Person> userStorage;

    public PersonDAOCollectionImpl()
    {
        userStorage = new ArrayList<Person>();

    }

    @Override
    public Person persist(Person person) {
        if (person == null) throw new IllegalArgumentException("person was null");
       return person;
    }

    @Override
    public Person findById(int id) {
        for (Person person : userStorage)
            if (person.getId() == id)
                return person;
        return null;


       }

    public Person findByEmail(String email) {
        if (email == null) throw new IllegalArgumentException("email is null");
        for (Person person : userStorage)
            if (person.getEmail() == email)
                return person;
        return null;

    }

    @Override
    public List<Person> findAll() {
        return new ArrayList<>(userStorage);
    }

    @Override
    public void remove(int id) {

    }
}
