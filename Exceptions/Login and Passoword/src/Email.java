public class Email extends Cadastro {
    @Override
    public void verificarCadastro() {
        System.out.println("email:");
        cadastro = scanner.next();
        try {
            if (!cadastro.contains("@")||!cadastro.contains(".com")) {
                throw new Exception("email invalido");
            }
            System.out.println("email valido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            verificarCadastro();
        }
    }
    @Override
    public String getCadastro() {
        return cadastro;
    }
}
