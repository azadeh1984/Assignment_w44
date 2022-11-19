package se.lexicon;


public class App 
{
    public static void main( String[] args ) {

        Person artina = new Person(2015,"Artina","Razbani","artina@yahoo.com"); // 12345
        Person test = new Person(2015,"Artina","Razbani","artina@yahoo.com"); // 789456

        System.out.println(artina.personInformation());
        System.out.println(test.personInformation());

        boolean isEqual = artina.equals(test); // true
        System.out.println(isEqual);

        System.out.println(artina.hashCode());
        System.out.println(test.hashCode());




    }




}
