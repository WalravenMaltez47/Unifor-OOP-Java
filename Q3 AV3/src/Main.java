public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Pedro","Show");
        livro1.setTitulo("top"); // mudança de Titulo
        livro1.addAutor(livro1);

        Livro livro2 = new Livro("jao", "coisa boa");
        livro2.addAutor(livro2);

        livro1.mostraLivro("Pedro");
        livro2.mostraLivro("jao");
    }
}