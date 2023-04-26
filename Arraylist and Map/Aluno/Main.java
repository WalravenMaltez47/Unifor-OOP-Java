import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Double> nota = new ArrayList<>();

    static String matricula;
    static String nome;

    public static void pegaDados() {
        System.out.println("Matricula:");
          matricula = scanner.next();
        System.out.println("Nome:");
         nome = scanner.next();

         for (int i = 0; i < 5; i++) {
             System.out.println("Digite a nota:");
             Double valor = scanner.nextDouble();
             nota.add(valor);
         }

        System.out.println("=================");
    }
    public static void main(String[] args) {

        // Procura aluno
        System.out.println("Digite a quantidade de alunos:");
        int quantidadeDeAlunos = scanner.nextInt();

        Map <String,Aluno> aluno = new HashMap<>();

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            pegaDados();
            aluno.put(matricula,new Aluno(matricula,nome, new CalculoDaMedia(nota).getCalculoDaMedia()));
        }

        System.out.println("Matricula: " + aluno.get("2210352").getMatricula());
        System.out.println("Nome: " + aluno.get("2210352").getNome());
        System.out.println("Nota: " + aluno.get("2210352").getNota());

    }
}
