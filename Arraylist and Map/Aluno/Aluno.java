import java.util.ArrayList;
public class Aluno {
   String matricula;
   String nome;
   double media;
   public Aluno(String matricula, String nome, double media) {
       this.matricula = matricula;
       this.nome = nome;
       this.media = media;
   }
   public String getMatricula() {
        return matricula;
   }
   public String getNome() {
        return nome;
   }
   public double getMedia() {
        return media;
   }
}
