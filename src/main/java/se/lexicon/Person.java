package se.lexicon;

import java.util.Objects;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(int id, String firstName, String lastName,String email){
        this.id = id;
        this.firstName= firstName;
        this.lastName = lastName;
        this.email = email;

    }

    public Person() {
    }

    public void setId(int id){this.id= id;}
    public int getId(){return id;}

    public void setFirstName(String firstName){
        if(firstName== null)throw new IllegalArgumentException("firstName param was null");
        this.firstName= firstName;}
    public String getFirstName(){return firstName;}

    public void setLastName(String lastName){
        if(lastName== null)throw new IllegalArgumentException("lastName param was null");
        this.lastName= lastName;}
    public String getLastName(){return lastName;}

    public void setEmail(String email){
        if(email== null)throw new IllegalArgumentException("Email param was null");
        this.email= email;}
    public String getEmail(){return email;}

    public String personInformation(){
        return "person : id:" +id + "firstName:" +firstName + "lastName:" +lastName+ "email:" +email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email);
    }
}
