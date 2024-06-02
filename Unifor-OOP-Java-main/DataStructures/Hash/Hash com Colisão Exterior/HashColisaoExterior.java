import java.util.NoSuchElementException;

public class HashColisaoExterior {

    public ListaDuplamenteEncadeada[] vetor;
    public int nElementos;

    public HashColisaoExterior(int capacidade) {
        this.vetor = new ListaDuplamenteEncadeada[capacidade];
        for (int i = 0; i < vetor.length; i++) {
            this.vetor[i] = new ListaDuplamenteEncadeada();
        }
        this.nElementos = 0;
    }

    public int tamanho() {
        return this.nElementos;
    }

    public void imprime() {
        System.out.println("Chave\tValor");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(i + " -->\t");
            vetor[i].imprimirLista();
        }
    }

    private int funcaoHash(Integer elemento) {
        return elemento % this.vetor.length;
    }

    public void insere(Integer elemento) {
        int endereco = funcaoHash(elemento);
        this.vetor[endereco].insereFinal(elemento);
        this.nElementos++;
    }

    public boolean remove(int elemento) {
        int endereco = funcaoHash(elemento);
        boolean removeu = this.vetor[endereco].removeElemento(elemento);

        if (removeu) this.nElementos--;

        return removeu;
    }

    public boolean contem(int elemento) {
        int endereco = funcaoHash(elemento);
        return this.vetor[endereco].contem(elemento);
    }

    public static void main(String[] args) {

        HashColisaoExterior tabela = new HashColisaoExterior(50);

        tabela.insere(23503);
        tabela.insere(23215);
        tabela.insere(19124);
        tabela.insere(12493);
        tabela.insere(12493);
        tabela.insere(100);
        tabela.insere(200);
        tabela.imprime();
    }
}

class ListaDuplamenteEncadeada {
    private static class Nodo {
        public int valor;
        public Nodo proximo;
        public Nodo anterior;

        public Nodo(int valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }

    private Nodo primeiro;
    private Nodo ultimo;
    private int nElementos; 

    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
        this.nElementos = 0; 
    }

    public void insereInicio(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (primeiro == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            novoNodo.proximo = primeiro;
            primeiro.anterior = novoNodo;
            primeiro = novoNodo;
        }
        nElementos++; 
    }

    public void removeInicio() {
        if (primeiro == null) {
            throw new NoSuchElementException("A lista está vazia");
        } else {
            primeiro = primeiro.proximo;
            if (primeiro != null)
                primeiro.anterior = null;
            nElementos--; 
            if (nElementos == 0) { 
                ultimo = null;
            }
        }
    }

    public void insereFinal(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (ultimo == null) {
            primeiro = novoNodo;
            ultimo = novoNodo;
        } else {
            ultimo.proximo = novoNodo;
            novoNodo.anterior = ultimo;
            ultimo = novoNodo;
        }
        nElementos++; 
    }

    public void removeFinal() {
        if (ultimo == null) {
            throw new NoSuchElementException("A lista está vazia");
        } else {
            if (primeiro == ultimo) {
                primeiro = null;
                ultimo = null;
            } else {
                ultimo = ultimo.anterior;
                ultimo.proximo = null;
            }
            nElementos--; 
        }
    }

    public void inserePosicao(int valor, int posicao) {
        if (posicao < 0 || posicao > nElementos) { 
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            insereInicio(valor);
        } else if (posicao == nElementos) { 
            insereFinal(valor);
        } else {
            Nodo novoNodo = new Nodo(valor);
            Nodo atual = primeiro;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.proximo;
            }
            novoNodo.proximo = atual.proximo;
            novoNodo.anterior = atual;
            atual.proximo.anterior = novoNodo;
            atual.proximo = novoNodo;
            nElementos++; 
        }
    }

    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= nElementos) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }

        if (posicao == 0) {
            removeInicio();
        } else if (posicao == nElementos - 1) { 
            removeFinal();
        } else {
            Nodo atual = primeiro;
            for (int i = 0; i < posicao; i++) {
                atual = atual.proximo;
            }
            atual.anterior.proximo = atual.proximo;
            atual.proximo.anterior = atual.anterior;
            nElementos--; 
        }
    }

    public void imprimirLista() {
        Nodo atual = primeiro;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public boolean contem(int valor) {
        Nodo atual = primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public boolean removeElemento(int valor) {
        Nodo atual = primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual == primeiro) {
                    removeInicio();
                } else if (atual == ultimo) {
                    removeFinal();
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                    nElementos--; 
                }
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }
}