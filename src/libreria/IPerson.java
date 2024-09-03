package libreria;

import java.util.ArrayList;
import java.util.List;

public interface IPerson {
    void RegisterPerson(String name,String lastname,String email);
    void UpdatedPersona(String newName,String newLastname,String newEmail);
    List<ArrayList<Libro>> HistorialLibros();
    void AgregarLibro(Libro libro);
}
