public class Main {
    public static void main(String[] args) {
        Email email = new Email();
        email.verificarCadastro();
        Password password = new Password();
        password.verificarCadastro();

        System.out.println("============");

        System.out.println(email.getCadastro());
        System.out.println(password.getCadastro());
    }
}