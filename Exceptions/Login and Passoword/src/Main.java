import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VerificacaoDeLogin login = new VerificacaoDeLogin();
        Cadastro cadastro = new Cadastro();
        cadastro.setLogin(login);
        cadastro.cadastrar();
        cadastro.recadastrar();
        login.getUsersList();
    }
}