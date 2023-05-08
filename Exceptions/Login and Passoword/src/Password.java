public class Password extends Cadastro {
    @Override
    public void verificarCadastro() {
        System.out.println("senha:");
        cadastro = scanner.next();
        try {
            if (!cadastro.contains("!")&&
                    !cadastro.contains("@")&&
                    !cadastro.contains("#")&&
                    !cadastro.contains("$")) {

                throw new Exception("senha fraca");
            }
            System.out.println("senha forte");
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
