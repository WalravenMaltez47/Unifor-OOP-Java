import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String palavra = sc.next();
            Array<Character> pilha = new Array<>();

            for (char ch : palavra.toCharArray()) {
                pilha.empilha(ch);
            }
            
            System.out.println(pilha.palindromo() ? "SIM" : "NAO");
        }

        sc.close();
    }
}

class Array<T extends Comparable<T>> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
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
        if (size == array.length) {
            resizeArray();
        }
        this.array[size] = valor;
        size++;
    }

    public void desempilha() {
        if (size > 0) {
            this.array[size - 1] = null;
            size--;
        }
    }

    private void resizeArray() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Comparable[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        this.array = newArray;
    }

    public void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(getValueByPos(i));
        }
    }

    public boolean palindromo() {
        if (size <= 1) {
            return true;
        }

        for (int i = 0; i < size / 2; i++) {
            if (!array[i].equals(array[size - 1 - i])) {
                return false;
            }
        }

        return true;
    }
}
