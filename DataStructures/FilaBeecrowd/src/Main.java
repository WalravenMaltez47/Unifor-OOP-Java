import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Entra
            int N = sc.nextInt();
            int[][] fila = new int[N][2]; 
            for (int i = 0; i < N; i++) {
                fila[i][0] = sc.nextInt();
                fila[i][1] = 1;
            }

            // Sai
            int M = sc.nextInt();
            for (int i = 0; i < M; i++) {
                int pessoaQueSaiu = sc.nextInt();
                for (int j = 0; j < N; j++) {
                    if (fila[j][0] == pessoaQueSaiu) {
                        fila[j][1] = 0;
                        break;
                    }
                }
            }

            int[][] novaFila = new int[N - M][2];
            int linhaNovaFila = 0;
            for (int i = 0; i < N; i++) {
                if (fila[i][1] == 1) {
                    novaFila[linhaNovaFila][0] = fila[i][0];
                    novaFila[linhaNovaFila][1] = fila[i][1];
                    linhaNovaFila++;
                }
            }

            
            for (int i = 0; i < novaFila.length; i++) {
                System.out.print(novaFila[i][0] + " ");
            }
        }

        System.out.println();
    }
}
