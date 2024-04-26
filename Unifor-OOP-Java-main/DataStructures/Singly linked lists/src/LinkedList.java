import java.util.NoSuchElementException;

public class LinkedList<T extends Comparable<T>> {
    private static class Node<T> {
        public T valor;
        public Node<T> next;

        Node(T valor) {
            this.valor = valor;
            this.next = null;
        }
    }


    private Node<T> primeiro;
    private Node<T> ultimo;
    private int tamanho;

    LinkedList() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void insereInicio(T valor) {
        Node<T> newNode = new Node<>(valor);
        if (primeiro == null) {
            primeiro = newNode;
            ultimo = newNode;
       }

       else {
            newNode.next = primeiro;
            primeiro = newNode;
       }
    }

    public void removeInicio() {
        if (primeiro == null) {
            throw new NoSuchElementException("A lista está vazia");
        } else {
            primeiro = primeiro.next;
            tamanho--;
            if (tamanho == 0) {
                ultimo = null;
            }
        }
    }
    

    public void insereFinal(T valor) {
        Node<T> novoNodo = new Node<>(valor);
        if (ultimo == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            ultimo.next = novoNodo;
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
                Node<T> atual = primeiro;
                while (atual.next != ultimo) {
                    atual = atual.next;
                }
                atual.next = null;
                ultimo = atual;
            }
            tamanho--;
        }
    }

    public void inserePosicao(T valor, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            insereInicio(valor);
        } else if (posicao == tamanho) {
            insereFinal(valor);
        } else {
            Node<T> novoNodo = new Node<>(valor);
            Node<T> atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.next;
            }
            novoNodo.next = atual.next;
            atual.next = novoNodo;
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
            Node<T> atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.next;
            }
            atual.next = atual.next.next;
            tamanho--;
        }
    }

    public void imprimirLista() {
        Node<T> atual = primeiro;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.next;
        }
        System.out.println();
    }
}