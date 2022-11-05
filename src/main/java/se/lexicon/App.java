package se.lexicon;


public class App 
{
    public static void main( String[] args ) {
        Person artina = new Person(2015,"Artina","Razbani","artina@yahoo.com");
        artina.setId(2015);
        artina.setFirstName("Artina");
        artina.setLastName("Razbani");
        artina.setEmail("artina@yahoo.com");

        System.out.println(artina.personInformation());


    }


}
