public class Aluno {
   String matricula;
   String nome;
   double nota;
   public Aluno(String matricula, String nome, double nota) {
       this.matricula = matricula;
       this.nome = nome;
       this.nota = nota;
   }
   public String getMatricula() {
        return matricula;
   }
   public String getNome() {
        return nome;
   }
   public double getNota() {
        return nota;
   }
}
