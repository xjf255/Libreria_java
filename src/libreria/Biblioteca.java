package libreria;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Person> persons = new ArrayList<>();
    private ArrayList<Libro> libros = new ArrayList<>();
    private  ArrayList<Libro> librosDisponibles = new ArrayList<>();
    private ArrayList<Prestamo> librosPrestados = new ArrayList<>();

    public Biblioteca() {}
    public Biblioteca(ArrayList<Person> persons, ArrayList<Libro> libros) {
        this.persons = persons;
        this.libros = libros;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public boolean addPerson(Person person) {
        return persons.add(person);
    }

    public boolean addLibro(Libro libro) {
        librosDisponibles.add(libro);
        return  libros.add(libro);
    }
    public ArrayList<Libro> getLibros() {
        return libros;
    }
    public boolean removeLibro(Libro libro) {
        return libros.remove(libro);
    }
    private boolean prestarLibro(Prestamo libro) {
        librosPrestados.remove(libro);
        return librosPrestados.add(libro);
    }
}
