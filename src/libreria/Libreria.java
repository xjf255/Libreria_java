package libreria;

import java.util.ArrayList;

public class Libreria {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("no se que poner");
        
        Biblioteca biblioteca = new Biblioteca();
        Person newPerson = new Person(1,"Juan","Diaz","Juan@nose.com");
        Person newPerson2 = new Person(2,"Fernando","Diaz","Juan@nose.com");

        Libro newLibro = new Libro();
        newLibro.setInfo("BlancaNieves","Nose");
        String infoLibro = newLibro.getInfo();
        System.out.print(infoLibro);

        biblioteca.addLibro(newLibro);

        biblioteca.addPerson(newPerson);
        biblioteca.addPerson(newPerson2);
        ArrayList<Person> persons = biblioteca.getPersons();

        System.out.println(newPerson.HistorialLibros());

        for(Person person : persons){
            System.out.println(person);
        }
    }
    
}
