public class Main {
    public static void main(String[] args) {
    LinkedList lista = new LinkedList(); 
    lista.insereInicio(3);
    lista.insereInicio(2);
    lista.insereInicio(1);
    lista.imprimirLista(); // Saída: 1 2 3

    lista.insereFinal(4);
    lista.insereFinal(5);
    lista.imprimirLista(); // Saída: 1 2 3 4 5

    lista.inserePosicao(10, 2);
    lista.imprimirLista(); // Saída: 1 2 10 3 4 5

    lista.removePosicao(3);
    lista.imprimirLista(); // Saída: 1 2 10 4 5

    lista.removeInicio();
    lista.imprimirLista(); // Saída: 2 10 4 5

    lista.removeFinal();
    lista.imprimirLista(); // Saída: 2 10 4
    
}
}
