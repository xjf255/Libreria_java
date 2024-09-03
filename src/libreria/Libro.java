package libreria;

public class Libro {

    private int id;
    private String titulo;
    private String autor;

    public String getInfo() {
        String info = "id: " + id + " del libro :" + titulo + " del autor: " + autor;
        return info;
    };

    public Libro() {}

    public void setInfo(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
        this.id++;
    }   
}
