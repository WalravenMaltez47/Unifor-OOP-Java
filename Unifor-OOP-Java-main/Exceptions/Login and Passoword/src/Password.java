public class Password {

    Password(String senha, Cadastro verifcacaoSenha) {
        try {
            if (!senha.contains("!")&&!senha.contains("@")||senha.length()<8){
                throw new RuntimeException("senha invalida");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            verifcacaoSenha.setSenha();
        }
    }
}
