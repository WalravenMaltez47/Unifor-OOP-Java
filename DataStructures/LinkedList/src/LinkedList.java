import java.util.NoSuchElementException;

public class LinkedList<T> {
    private static class No<T> {
        public T valor;
        public No<T> proximo;
    
        public No(T valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }

    private No<T> primeiro;
    private No<T> ultimo;
    private int tamanho;

    LinkedList() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    public void insereInicio(int valor) {
        No<T> novoNodo = new No(valor);
        if (primeiro == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            novoNodo.proximo = primeiro;
            primeiro = novoNodo;
        }
        tamanho++;
    }

    public void removeInicio() {
        if (primeiro == null) {
            throw new NoSuchElementException("A lista está vazia");
        } else {
            primeiro = primeiro.proximo;
            tamanho--;
            if (tamanho == 0) {
                ultimo = null;
            }
        }
    }
    

    public void insereFinal(int valor) {
        @SuppressWarnings({ "rawtypes", "unchecked" })
        No<T> novoNodo = new No(valor);
        if (ultimo == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            ultimo.proximo = novoNodo;
            ultimo = novoNodo;
        }
        tamanho++;
    }

    public void removeFinal() {
        if (ultimo == null) {
            throw new NoSuchElementException("A lista está vazia");
        } else {
            if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                No atual = primeiro;
                while (atual.proximo != ultimo) {
                    atual = atual.proximo;
                }
                atual.proximo = null;
                ultimo = atual;
            }
            tamanho--;
        }
    }

    public void inserePosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            insereInicio(valor);
        } else if (posicao == tamanho) {
            insereFinal(valor);
        } else {
            No<T> novoNodo = new No(valor);
            No<T> atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novoNodo.proximo = atual.proximo;
            atual.proximo = novoNodo;
            tamanho++;
        }
    }

    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            removeInicio();
        } else if (posicao == tamanho - 1) {
            removeFinal();
        } else {
            No<T> atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }
    }

    public void imprimirLista() {
        No<T> atual = primeiro;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}