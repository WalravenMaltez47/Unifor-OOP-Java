public class Texto {
    String conteudo;
    String qtd_De_Palavras;
    Texto(String texto) {
        this.conteudo = texto;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }public String getConteudo() {
        return conteudo;
    }

    public int contarPalavras(Texto texto) {
        qtd_De_Palavras = texto.getConteudo().replaceAll("\\s","");
        return qtd_De_Palavras.length();
    }
}
