public class Main {
    public static void main(String[] args) {
        Array<Integer> pilha = new Array<>();
        pilha.empilha(2);
        pilha.empilha(3);
        pilha.empilha(1);

        pilha.desempilha();
        pilha.sort();
        pilha.empilha(0);
        pilha.sort();
        pilha.print();
        System.out.println(pilha.getSize());
    }
}

class Array<T extends Comparable<T>> {
    private T[] array;
    private int size;

    Array() {
        this.array = (T[]) new Comparable[10];
        this.size = 0;
    }
    public T[] getArray() {
        return array;
    }
    public int getSize() {
        return size;
    }

    public T getValueByPos(int pos) {
        return this.array[pos];
    }

    public void empilha(T valor) {
        this.array[size] = valor;
        size++;
    }

    public void desempilha() {
        this.array[getSize()-1] = null;
        size--;
    }

    public void sort() {
        for(int i = 0; i < getSize()-1; i++) {
            for (int j = 0; j < getSize()-i-1; j++) {
               if(array[j].compareTo(array[j+1]) > 0) {
                T aux = array[j];
                array[j] = array[j+1];
                array[j+1] = aux;
               }
            }
        }}

    public void print() {
        for(int i = 0; i < getSize(); i++) {
            System.out.println(getValueByPos(i));
        }
    }    
}