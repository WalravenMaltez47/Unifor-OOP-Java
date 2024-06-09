import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int testCases = scanner.nextInt();
            
            for (int t = 1; t <= testCases; t++) {
                int n = scanner.nextInt();
                ArvoreBinariaBusca arvore = new ArvoreBinariaBusca();
                
                for (int i = 0; i < n; i++) {
                    arvore.insere(scanner.nextInt());
                }
                
                System.out.println("Case " + t + ":");
                System.out.print("Pre.: ");
                arvore.imprimePreOrdem();
                System.out.print("In..: ");
                arvore.imprimeEmOrdem();
                System.out.print("Post: ");
                arvore.imprimePosOrdem();

                System.out.println();
            }
        }
    }
}

class ArvoreBinariaBusca {

    class Nodo {

        public int elemento;
        public Nodo esquerdo;
        public Nodo direito;

        public Nodo(int elemento) {
            this.elemento = elemento;
            this.esquerdo = null;
            this.direito = null;
        }
    }

    public Nodo raiz;
    public int nElementos;

    public ArvoreBinariaBusca() {
        this.raiz = null;
        this.nElementos = 0;
    }

    public int tamanho() {
        return this.nElementos;
    }

    public boolean estaVazia() {
        return this.raiz == null;
    }

    public void imprimeEmLargura() {

        FilaDinamica<Nodo> fila = new FilaDinamica<Nodo>();

        fila.enfileira(this.raiz);
        while (!fila.estaVazia()) {

            Nodo cursor = fila.desenfileira();

            System.out.print(cursor.elemento + " ");

            if (cursor.esquerdo != null) {
                fila.enfileira(cursor.esquerdo);
            }

            if (cursor.direito != null) {
                fila.enfileira(cursor.direito);
            }
        }

        System.out.println();

    }

    public void imprimePreOrdem() {
        this.preOrdem(this.raiz);
        System.out.println();
    }

    public void imprimePosOrdem() {
        this.posOrdem(this.raiz);
        System.out.println();
    }

    public void imprimeEmOrdem() {
        this.emOrdem(this.raiz);
        System.out.println();
    }

    public void preOrdem(Nodo nodo) {

        if (nodo == null)
            return;

        System.out.print(nodo.elemento + " ");
        this.preOrdem(nodo.esquerdo);
        this.preOrdem(nodo.direito);
    }

    public void posOrdem(Nodo nodo) {

        if (nodo == null)
            return;

        this.posOrdem(nodo.esquerdo);
        this.posOrdem(nodo.direito);
        System.out.print(nodo.elemento + " ");
    }

    public void emOrdem(Nodo nodo) {

        if (nodo == null)
            return;

        this.emOrdem(nodo.esquerdo);
        System.out.print(nodo.elemento + " ");
        this.emOrdem(nodo.direito);
    }

    public void insere(int elemento) {
        this.insere(elemento, this.raiz);
    }

    public void insere(int elemento, Nodo nodo) {

        Nodo novo = new Nodo(elemento);

        if (nodo == null) {
            this.raiz = novo;
            this.nElementos++;
            return;
        }

        if (elemento < nodo.elemento) {
            if (nodo.esquerdo == null) {
                nodo.esquerdo = novo;
                this.nElementos++;
                return;
            } else {
                this.insere(elemento, nodo.esquerdo);
            }
        }

        if (elemento > nodo.elemento) {
            if (nodo.direito == null) {
                nodo.direito = novo;
                this.nElementos++;
                return;
            } else {
                this.insere(elemento, nodo.direito);
            }
        }
    }

    @SuppressWarnings("unused")
    private Nodo maiorElemento(Nodo nodo) {
        while (nodo.direito != null) {
            nodo = nodo.direito;
        }
        return nodo;
    }

    private Nodo menorElemento(Nodo nodo) {
        while (nodo.esquerdo != null) {
            nodo = nodo.esquerdo;
        }
        return nodo;
    }

    public boolean remove(int elemento) {
        return this.remove(elemento, this.raiz) != null;
    }

    private Nodo remove(int elemento, Nodo nodo) {

        if (nodo == null) {
            System.out.println("Valor não encontrado");
            return null;
        }

        if (elemento < nodo.elemento) {
            nodo.esquerdo = this.remove(elemento, nodo.esquerdo);
        } else if (elemento > nodo.elemento) {
            nodo.direito = this.remove(elemento, nodo.direito);
        } else {

            // if(nodo.esquerdo == null && nodo.direito == null) {
            // return null;
            // }

            if (nodo.esquerdo == null) {
                this.nElementos--;
                return nodo.direito;
            } else if (nodo.direito == null) {
                this.nElementos--;
                return nodo.esquerdo;
            } else {
                Nodo substituto = this.menorElemento(nodo.direito);
                nodo.elemento = substituto.elemento;
                this.remove(substituto.elemento, nodo.direito);
            }
        }

        return nodo;
    }

    public boolean busca(int elemento) {
        return this.busca(elemento, this.raiz);

    }

    public boolean busca(int elemento, Nodo nodo) {

        if (nodo == null) {
            return false;
        }

        if (elemento < nodo.elemento) {
            return this.busca(elemento, nodo.esquerdo);
        } else if (elemento > nodo.elemento) {
            return this.busca(elemento, nodo.direito);
        } else {
            return true;
        }
    }

    private int altura(Nodo nodo) {

        if (nodo == null) {
            return -1;
        }

        int alturaEsquerda = this.altura(nodo.esquerdo) + 1;
        int alturaDireita = this.altura(nodo.direito) + 1;

        int altura = alturaEsquerda > alturaDireita ? alturaEsquerda : alturaDireita;

        return altura;

    }

    public int altura() {
        return this.altura(this.raiz);
    }
}

class FilaDinamica<T> {

    class Nodo {

        public T elemento;
        public Nodo proximo;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int nElementos;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.nElementos = 0;
    }

    public int tamanho() {
        return this.nElementos;
    }

    public boolean estaVazia() {
        return this.nElementos == 0;
    }

    public void imprime() {

        System.out.print("[");
        Nodo cursor = this.inicio;
        for (int i = 0; i < this.nElementos; i++) {
            System.out.print(cursor.elemento + " ");
            cursor = cursor.proximo;
        }
        if (this.nElementos == 0)
            System.out.println("] Inicio: " + this.inicio + ", Fim: " + this.fim);
        else
            System.out.println("] Inicio: " + this.inicio.elemento + ", Fim: " + this.fim.elemento);

    }

    public T desenfileira() {

        if (this.estaVazia()) {
            System.out.println("Lista vazia. Não é possível remover.");
            return null;
        }

        Nodo nodoRemovido = this.inicio;

        if (this.nElementos == 1) {
            this.inicio = null;
            this.fim = null;
        } else {
            this.inicio = nodoRemovido.proximo;

            nodoRemovido.proximo = null;
        }

        this.nElementos--;

        return nodoRemovido.elemento;

    }

    public void enfileira(T elemento) {

        Nodo novo = new Nodo(elemento);

        if (this.estaVazia()) {
            this.inicio = novo;
        } else {
            this.fim.proximo = novo;
        }

        this.fim = novo;
        this.nElementos++;
    }

    public T espia() {

        if (this.estaVazia()) {
            System.out.println("Lista vazia! Não é possível espiar.");
            return null;
        }

        return this.inicio.elemento;
    }

    public boolean contem(Integer elemento) {

        Nodo cursor = this.inicio;
        for (int i = 0; i < this.nElementos; i++) {
            if (cursor.elemento.equals(elemento)) {
                return true;
            }
            cursor = cursor.proximo;
        }

        return false;
    }
}
