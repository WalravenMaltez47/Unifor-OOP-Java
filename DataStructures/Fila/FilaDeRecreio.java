import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt(); 
            for (int i = 0; i < N; i++) {
                int M = sc.nextInt(); 
                FilaDeRecreio filaDeRecreio = new FilaDeRecreio(M); 
                for (int j = 0; j < M; j++) {
                    int nota = sc.nextInt();
                    filaDeRecreio.add(nota);
                }
                filaDeRecreio.print(M);
            }
        }
    }
}

public class FilaDeRecreio {
    Fila2D fila;

    public FilaDeRecreio(int tamanho) {
        this.fila = new Fila2D(tamanho);
    }

    public void add(int nota) {
        if (fila == null) {
            System.out.println("Erro: Fila não inicializada corretamente.");
            return;
        }
        fila.insere(nota);
    }

    public void print(int M) {
        if (fila == null) {
            System.out.println("Erro: Fila não inicializada corretamente.");
            return;
        }
        int count = 0;
        fila.trocar();
        for (int i = 0; i < M; i++) {
            if (fila.getFilaColuna2(i) == i) {
                count++;
            }
        }
        System.out.println(count);
    }
}

class Fila2D {
    private int[][] fila;
    private int size;

    Fila2D(int tamanho) {
        this.fila = new int[tamanho][2];
        this.size = 0;
    }

    public void insere(int valor) {
        fila[size][0] = valor;
        fila[size][1] = size; 
        size++;
    }

    public int[][] getFila() {
        return fila;
    }

    public int getFilaColuna2(int pos) {
        return fila[pos][1];
    }

    public void trocar() {
       
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {

                if (fila[j][0] < fila[j + 1][0]) {
                    int[] temp = fila[j];
                    fila[j] = fila[j + 1];
                    fila[j + 1] = temp;
                }
            }
        }
    }
}
