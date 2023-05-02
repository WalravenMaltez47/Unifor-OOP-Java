package Aluno;

import java.util.ArrayList;
public class Aluno {
        String matricula;
        String nome;
        double nota;
        Double media;

        public Aluno(String matricula, String nome, double nota) {
            this.matricula = matricula;
            this.nome = nome;
            this.nota = nota;
        }
        public Aluno(ArrayList<Double> nota) {
            media = (nota.get(0)+nota.get(1)+nota.get(2)+nota.get(3)+nota.get(4)) / 3;
        }

        public double getCalculoDaMedia() {
        return media;
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
