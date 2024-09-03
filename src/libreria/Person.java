package libreria;

import java.util.ArrayList;
import java.util.List;

public class Person implements IPerson {
    private int id;
    private String name;
    private String lastName;
    private String email;
    private ArrayList<Libro> books = new ArrayList<>();

    public Person(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public void RegisterPerson(String name, String lastName, String email) {
        this.id = 1;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    @Override
    public void UpdatedPersona(String newName, String newLastname, String newEmail) {
        this.name = newName;
        this.lastName = newLastname;
        this.email = newEmail;
    }

    @Override
    public List<ArrayList<Libro>> HistorialLibros() {
        return List.of(books);
    }

    @Override
    public void AgregarLibro(Libro libro) {
        books.add(libro);
    }
}
