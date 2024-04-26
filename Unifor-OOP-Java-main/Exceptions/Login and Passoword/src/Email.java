public class Email {

    Email(String email, Cadastro verificacaoEmail) {
        try {
            if (!email.contains("@")||!email.contains(".com")) {
                throw new RuntimeException("formato de email invalido");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            verificacaoEmail.setEmail();
        }
    }
}














