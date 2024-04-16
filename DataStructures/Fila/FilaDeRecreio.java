import java.util.Scanner;

public class FilaDeRecreio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Lê o número de casos de teste

        for (int caso = 0; caso < N; caso++) {
            int M = sc.nextInt(); // Lê o número de alunos para esse caso
            int[][] alunos = new int[M][2];
            for (int i = 0; i < M; i++) {
                alunos[i][0] = sc.nextInt(); // Nota do aluno
                alunos[i][1] = i; // Índice original
            }

            // Implementação do Bubble Sort para ordenar de forma decrescente por nota
            boolean swapped;
            do {
                swapped = false;
                for (int i = 1; i < M; i++) {
                    if (alunos[i - 1][0] < alunos[i][0]) { // Compara e troca se necessário
                        int[] temp = alunos[i - 1];
                        alunos[i - 1] = alunos[i];
                        alunos[i] = temp;
                        swapped = true;
                    }
                }
            } while (swapped);

            int count = 0;
            for (int i = 0; i < M; i++) {
                if (alunos[i][1] == i) {
                    count++; // Conta quantos alunos mantiveram a mesma posição
                }
            }

            System.out.println(count); // Imprime o resultado para o caso de teste atual
        }

        sc.close();
    }
}

