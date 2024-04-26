import java.util.NoSuchElementException;

public class Main {
public static void main(String[] args) {
    DLL pilha = new DLL();
    
    pilha.empilha(2);
    pilha.empilha(3);
    pilha.empilha(2);
    pilha.empilha(1);
    

    pilha.ordenarCrescente();
    pilha.print();
    System.out.println(pilha.getSize());

    pilha.desempilha();
    pilha.print();
    System.out.println(pilha.getSize());

    pilha.empilha(10);
    pilha.print();
    System.out.println(pilha.getSize());

}}

class DLL {
    private static class Node {
        private int valor;
        private Node left;
        private Node rigth;

        Node(int valor) {
            this.valor = valor;
            this.left = null;
            this.rigth = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    DLL() {
        this.last = null;
        this.first = null;
        this.size = 0;
    }
    public int getSize() {
        return size;
    }

    public void empilha(int valor) {
        Node newNode = new Node(valor);

        if (first == null && last == null) {
            first = newNode;
            last = newNode;
        } 
        
        else {
            Node aux = last; // salva o antigo ultimo
            last = newNode; // antigo ultimo e atualizado
            last.left = aux; // o nó last agora está apontando para o nó aux
            aux.rigth = last; // o nó aux agora está apontando para o nó last
        }

        size++;
    }
    

    public void desempilha() {
        
        if (first == null && last == null) {
            throw new NoSuchElementException("A lista está vazia");
        } 
        
        else {

            if (first == last) {
                first = null;
                last = null;
            } 
            
            else {
                Node aux = last.left;
                aux.rigth = null;
                last = aux;
            }

            size--;
        }
    }

    public void ordenarCrescente() {
    Node atual = first;
    // Percorrer a lista até o penúltimo nó
    while (atual.rigth != null) {
        Node nextNode = atual.rigth;
        // Percorrer os nós à direita do atual
        while (nextNode != null) {
            if (atual.valor > nextNode.valor) {
                // Trocar os valores dos nós
                int aux = atual.valor;
                atual.valor = nextNode.valor;
                nextNode.valor = aux;
            }
            nextNode = nextNode.rigth;
        }
        atual = atual.rigth;
    }
}


    public void print() {
        Node atual = first;
        System.out.println("Lista: " );
        while(atual!=null) {
            System.out.println(atual.valor + " ");
            atual = atual.rigth;
        }
        System.out.println();
    }
}
    
    