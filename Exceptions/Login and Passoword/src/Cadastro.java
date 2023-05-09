import java.util.Scanner;
public class Cadastro {
    Scanner scanner = new Scanner(System.in);
    private String user;
    private String email;
    private String senha;
    private VerificacaoDeLogin login;

    public void setUser() {
        System.out.println("user:");
        user = scanner.next();
    }

    public void setEmail() {
        System.out.println("email:");
        email = scanner.next();
        new Email(email,this);
    }

    public void setSenha() {
        System.out.println("senha:");
        senha = scanner.next();
        new Password(senha.trim(),this);
    }

    public String getUser() {return user;}
    public String getEmail() {return email;}
    public String getSenha() {return senha;}

    public void setLogin(VerificacaoDeLogin login) {
        this.login = login;
    }

    public void cadastrar() {

        setUser();
        setEmail();
        setSenha();

        System.out.println("==========");
        System.out.println("Login");
        System.out.println("==========");

        login.verificarLogin(this);
    }

    public void recadastrar() {
        boolean recadastramento = true;
        while (recadastramento) {
            System.out.println("de novo?");
            String pedido = scanner.next();
            if (pedido.equalsIgnoreCase("sair")) {
                recadastramento = false;
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

