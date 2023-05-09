import java.util.Scanner;
public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private String user;
    private String email;
    private String senha;
    private VerificacaoDeLogin login;

    Cadastro(VerificacaoDeLogin login) {
        this.login = login;
    }

    // Setters
    public void setUser() {
        System.out.println("user:");
        user = scanner.next();
    } public void setEmail() {
        System.out.println("email:");
        email = scanner.next();
        new Email(email,this);
    } public void setSenha() {
        System.out.println("senha:");
        senha = scanner.next();
        new Password(senha.trim(),this);
    }

    // Getters
    public String getUser() {return user;}
    public String getEmail() {return email;}
    public String getSenha() {return senha;}

    // Cadastramento
    public void cadastrar() {
        setUser();
        setEmail();
        setSenha();

        System.out.println("==========");
        System.out.println("Login");
        System.out.println("==========");

        login.verificarLogin(this);

    } public void novoCadastrar() {
        boolean novoCadastramento = true;
        while (novoCadastramento) {
            System.out.println("'sim' para um novo cadastro");
            System.out.println("'sair' para sair");
            String pedido = scanner.next();
            if (pedido.equalsIgnoreCase("sair")) {
                novoCadastramento = false; // break
            }
            else if (pedido.equalsIgnoreCase("sim")) {
                cadastrar();
            }
            else {
                System.out.println("falha de usuario");
                cadastrar();
            }
        }
    }
}

