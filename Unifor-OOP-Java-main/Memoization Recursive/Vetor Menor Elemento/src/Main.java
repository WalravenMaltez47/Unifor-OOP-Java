import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            MyArray<Integer> menorElemento = new MyArray<>();
            int N = sc.nextInt();

            Integer[] newArray = new Integer[N]; 
            for (int i = 0; i < N; i++) {
                int valor = sc.nextInt();
                newArray[i] = valor;
            }

            menorElemento.add(newArray, 0, N);
            System.out.println(menorElemento.getArrayByIndex(0));
        }
    }
}

class MyArray<T extends Comparable<T>> { 
    private T[] array;
    private int size; 

    MyArray() {
        this.array = (T[]) new Comparable[10]; 
        this.size = 0;
    }
    
    public void add(T[] newArray, int i, int N) {
        if (i >= N) {
            bubbleSort();
            return;
        }

        array[size] = newArray[i]; 
        size++;
        add(newArray, i + 1, N);
    }

    public T getArrayByIndex(int i) {
        return array[i]; 
    }

    public void bubbleSort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) { 
                    T aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }
}
