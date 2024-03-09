package src;
public class ArrayList<T> implements Interface<T> {

    private T[] array;
    private int size = 0;
    
    @SuppressWarnings("unchecked")
    ArrayList() {
        this.array = (T[]) new Object[10];
    }

    // ADD
    @Override
    public void add(T elemento) {
        array[size] = elemento;
        size++;

        if (size == array.length) {
            @SuppressWarnings("unchecked")
            T[] newArray = (T[]) new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
            }
        }

    // REMOVE
    @Override
    public void remove(int index) {
        array[index] = array[index + 1];
        
        if (index == size - 1) {
            size--;
            return;
        }
        
        remove(index + 1);
    }

    // Setters
    @Override
    public void set(T elemento, int index) {
        if (index < array.length) {
            array[index] = elemento;
            
        }

        else set(elemento, index + 1);
    }

    // Getters
    @Override
    public int getSize() {
        return size;
    }

    @Override
    public T get(int i) {
        return array[i];
    }

    public void sort() {}


}
