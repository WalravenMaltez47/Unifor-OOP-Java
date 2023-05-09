import java.util.ArrayList;
import java.util.Scanner;

public class VerificacaoDeLogin {
    private String userLogin;
    private String senhaLogin;
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> users = new ArrayList<>();


    public void verificarLogin(Cadastro verificacaoDeLogin) {
        boolean login = false;
        int qtdDeTentativas = 3;
        while (!login && qtdDeTentativas > 0) {
            System.out.println("Tentativas disponiveis " + qtdDeTentativas);
            System.out.println("==============");
            System.out.println("Digite o nome de usuário:");
            userLogin = scanner.next();
            System.out.println("Digite a senha:");
            senhaLogin = scanner.next();

            try {
                if (!userLogin.equals(verificacaoDeLogin.getUser())) {
                    throw new Exception("usuario invalido");
                } else if (!senhaLogin.equals(verificacaoDeLogin.getSenha())) {
                    throw new Exception("senha invalida");
                } else {
                    login = true;
                    users.add(verificacaoDeLogin.getUser());
                    System.out.println("ACCESS GRANTED!");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            qtdDeTentativas--;

            if (qtdDeTentativas==0&&!login) {
                System.out.println("quantidade de tentativa excedida!");
            }
        }
    }

    // Lista de Usuarios
    public void getUsersList() {

        System.out.println("Lista:");
        for (String user: users) {
            System.out.println(user);
        }
    }
}
