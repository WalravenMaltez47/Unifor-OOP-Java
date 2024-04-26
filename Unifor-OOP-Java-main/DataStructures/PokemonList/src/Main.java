import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        ArrayList<String> names = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            names.add(sc.nextLine().trim());
        }

        bubbleSort(names); 

        for (int i = 0; i < names.size(); i++) {
            if (i < names.size() - 1) {
              System.out.print(names.get(i) + ", ");
            } else {
              System.out.println(names.get(i));
            }
          }

        sc.close();
    }

    public static void bubbleSort(ArrayList<String> names) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < names.size() - 1; i++) {
                if (names.get(i).compareTo(names.get(i + 1)) > 0) {
                    String temp = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, temp);
                    swapped = true;
                }
            }
        }
    }

}

// ArrayList
class ArrayList<T> {
    private T[] valores;
    private int size;

    public ArrayList() {
        this.valores = (T[]) new Object[10];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public void add(T valores) {
        this.valores[size] = valores;
        size++;

        if (size == this.valores.length) {
            growArray();
        }
    }

    public void set(int index, T valores) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        this.valores[index] = valores;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (T) this.valores[index];
    }

    private void growArray() {
        T[] newArray = (T[]) new Object[valores.length * 2];
        System.arraycopy(this.valores, 0, newArray, 0, this.valores.length);
        this.valores = newArray;
    }
}
