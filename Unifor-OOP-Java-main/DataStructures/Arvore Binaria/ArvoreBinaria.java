public class ArvoreBinaria<T> {

    class Nodo {

        public T elemento;
        public Nodo esquerdo;
        public Nodo direito;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.esquerdo = null;
            this.direito = null;
        }
    }

    public Nodo raiz;
    public int nElementos;

    public ArvoreBinaria() {
        this.raiz = null;
        this.nElementos = 0;
    }

    public boolean estaVazia() {
        return this.raiz == null;
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

    public Nodo busca(T elemento) {

        if (this.estaVazia()) {
            return null;
        }

        PilhaDinamica<Nodo> pilha = new PilhaDinamica<Nodo>();

        pilha.empilha(this.raiz);
        while (!pilha.estaVazia()) {

            Nodo cursor = pilha.desempilha();

            if (cursor.elemento.equals(elemento)) {
                return cursor;
            }

            if (cursor.esquerdo != null) {
                pilha.empilha(cursor.esquerdo);
            }

            if (cursor.direito != null) {
                pilha.empilha(cursor.direito);
            }
        }

        return null;
    }

    public boolean insereEsquerda(T elemento, T pai) {

        Nodo novo = new Nodo(elemento);

        if (this.estaVazia()) {
            this.raiz = novo;
            this.nElementos++;
            return true;
        }

        Nodo nodoPai = this.busca(pai);
        if (nodoPai != null) {
            if (nodoPai.esquerdo == null) {
                nodoPai.esquerdo = novo;
                this.nElementos++;
                return true;
            } else {
                System.out.println("Elemento já tem filho esquerdo!");
                return false;
            }
        } else {
            System.out.println("Elemento não existe na árvore!");
            return false;
        }
    }

    public boolean insereDireita(T elemento, T pai) {

        Nodo novo = new Nodo(elemento);

        if (this.estaVazia()) {
            this.raiz = novo;
            this.nElementos++;
            return true;
        }

        Nodo nodoPai = this.busca(pai);
        if (nodoPai != null) {
            if (nodoPai.direito == null) {
                nodoPai.direito = novo;
                return true;
            } else {
                System.out.println("Elemento já tem filho direito!");
                return false;
            }
        } else {
            System.out.println("Elemento não existe na árvore!");
            return false;
        }
    }

    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        // raiz
        arvore.insereDireita(5, null);

        // nível 1
        arvore.insereEsquerda(3, 5);
        arvore.insereDireita(8, 5);

        // nível 2
        arvore.insereEsquerda(1, 3);
        arvore.insereDireita(4, 3);
        arvore.insereEsquerda(7, 8);
        arvore.insereDireita(9, 8);

        // nível 3
        arvore.insereDireita(2, 1);
        arvore.insereEsquerda(6, 7);

        System.out.print("Em largura:\t");
        arvore.imprimeEmLargura();
        System.out.print("Pré-ordem:\t");
        arvore.imprimePreOrdem();
        System.out.print("Pós-ordem:\t");
        arvore.imprimePosOrdem();
        System.out.print("Em ordem:\t");
        arvore.imprimeEmOrdem();
    }

}

class PilhaDinamica<T> {

    private class Nodo {
        public T elemento;
        public Nodo proximo;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private Nodo topo;
    private int tamanho;

    public PilhaDinamica() {
        this.topo = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.topo == null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void empilha(T elemento) {
        Nodo novo = new Nodo(elemento);
        novo.proximo = this.topo;
        this.topo = novo;
        this.tamanho++;
    }

    public T desempilha() {
        if (this.estaVazia()) {
            throw new RuntimeException("Pilha está vazia!");
        }
        T elemento = this.topo.elemento;
        this.topo = this.topo.proximo;
        this.tamanho--;
        return elemento;
    }
}


class FilaDinamica<T> {

    private class Nodo {
        public T elemento;
        public Nodo proximo;

        public Nodo(T elemento) {
            this.elemento = elemento;
            this.proximo = null;
        }
    }

    private Nodo inicio;
    private Nodo fim;
    private int tamanho;

    public FilaDinamica() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.inicio == null;
    }

    public int tamanho() {
        return this.tamanho;
    }

    public void enfileira(T elemento) {
        Nodo novo = new Nodo(elemento);
        if (this.estaVazia()) {
            this.inicio = novo;
        } else {
            this.fim.proximo = novo;
        }
        this.fim = novo;
        this.tamanho++;
    }

    public T desenfileira() {
        if (this.estaVazia()) {
            throw new RuntimeException("Fila está vazia!");
        }
        T elemento = this.inicio.elemento;
        this.inicio = this.inicio.proximo;
        if (this.inicio == null) {
            this.fim = null;
        }
        this.tamanho--;
        return elemento;
    }
}
