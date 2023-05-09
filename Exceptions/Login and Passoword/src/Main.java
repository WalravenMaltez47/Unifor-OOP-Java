public class Main {
    public static void main(String[] args) {
        VerificacaoDeLogin login = new VerificacaoDeLogin();
        Cadastro cadastro = new Cadastro(login);
        cadastro.cadastrar();
        cadastro.novoCadastrar();
        login.getUsersList();
    }
}