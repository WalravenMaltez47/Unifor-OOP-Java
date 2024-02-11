public class ArrayList {
    private String[] array;
    private int size = 0;

    // GETTERS
    ArrayList(String [] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }
    public String getArrayIndexValue(int i) {
        return array[i];
    }

    // ADD
    public void add(String s) {
        array[size] = s;
        size++;

        if (array.length == size) {
            String[] newArray = new String[array.length*2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    // REMOVE
    public void removeArrayIndexValue(int index) {
        for (int i = index; i < size-1; i++) {
            array[i] = array[i+1];
        }
        size--;
    }
}
