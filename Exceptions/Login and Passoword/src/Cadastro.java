import java.util.Scanner;
public abstract class Cadastro {
    Scanner scanner = new Scanner(System.in);
    protected String cadastro;
    public abstract void verificarCadastro();
    public abstract String getCadastro();
}
