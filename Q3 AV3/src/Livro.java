import java.util.HashMap;

public class Livro {

    private String titulo;
    private String autores;
    public Livro livro;
    HashMap<String, Livro> biblioteca = new HashMap<>();

    Livro(String autores, String titulo) {
        this.autores = autores;
        this.titulo = titulo;
    }

    // Autor
    public void setAutores(String autores) {
        this.autores = autores;
    }public String getAutores() {
        return this.autores;
    }

    // Titulo
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    // Biblioteca
    public void addAutor(Livro livro) {
        biblioteca.put(livro.getAutores(), new Livro(livro.getAutores(), livro.getTitulo()));
    }

    public void mostraLivro(String autores) {
        System.out.println("Autor: " + biblioteca.get(autores).getAutores() + "," + " Titulo: " + biblioteca.get(autores).getTitulo());
    }
}

