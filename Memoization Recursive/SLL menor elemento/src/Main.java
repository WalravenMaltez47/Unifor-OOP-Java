public class Main {

    public static void main(String[] args) {
        SLinkedList<String> list = new SLinkedList<>();
        list.insert("b");
        list.insert("a");
        list.insert("d");
        list.insert("c");


        // Obtém o nó cabeça da lista
        Node<String> currentNode = list.getHead();

        // Percorre a lista e imprime os valores dos nós
        while (currentNode != null) {
            System.out.println(currentNode.valor);
            currentNode = currentNode.next;
        }
    }
}

class Node<T> {
    T valor;
    Node<T> next;

    Node(T valor) {
        this.valor = valor;
        this.next = null;
    }
}

class SLinkedList<T extends Comparable<T>> {
    Node<T> head;

    SLinkedList() {
        this.head = null;
    }

    public void insert(T valor) {
        Node<T> newNode = new Node<>(valor);

        if (head == null) {
            head = newNode;
            return;
        }

        if (valor.compareTo(head.valor) < 0) {
            // Ordena numeros em ordem crescente 
            // head.next = newNode;

            newNode.next = head; // Ordena em ordem alfabetica
            head = newNode;
            

            return;
        }

        else {
            Node<T> atual = head;

            if (atual.next != null && valor.compareTo(atual.next.valor) >= 0) {
                atual = atual.next;
            }
    
            newNode.next = atual.next;
            atual.next = newNode;
        }
    }

    public Node<T> getHead() {
        return head;
    }
}
