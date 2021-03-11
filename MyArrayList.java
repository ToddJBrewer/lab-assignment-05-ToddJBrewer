import java.util.Arrays;

/**
 * An implementation of the ArrayList data structure
 * 
 * @author
 */
public class MyArrayList<T> {
    protected T[] a;
    protected int size;

    /**
     * Constructor
     */


    public MyArrayList() //makes new array list and sets size at 0
    {
        a = (T[]) new Object[size];
        size = 0;
    }

    /**
     * Adds an item to the end of the list
     *
     * @param item the items to add
     */
    public void add(T item) //adds item to end of arraylist
    {
        if (size == a.length) {
            grow_array();
        }
        a[size++] = item;
    }

    /**
     * Adds an item to the list at a certain position
     *
     * @param pos  the position to add the item at
     * @param item the item to add
     */
    public void add(int pos, T item) //adds item at given position
    {
        for (int i = size; i > pos; i--) {
            a[i] = a[i - 1];
        }
        a[pos] = item;
        size++;
    }

    /**
     * Gets the item at the position
     *
     * @param pos position to get the item
     */
    public T get(int pos) // returns item at index
    {
        if (pos < 0 || pos >= size) {
            throw new UnsupportedOperationException("index out of bounds");
        }
        return a[pos];
    }

    /**
     * Removes and returns the item at a position
     *
     * @param pos the position to remove
     * @return the item at the position
     */
    public T remove(int pos) //returns item after removing it from arraylist
    {
        if (pos < 0 || pos >= size) {
            throw new UnsupportedOperationException("index out of bounds");
        }
        T ele = a[pos];
        for (int i = pos; i < size; i++) {
            a[i] = a[i + 1];
        }
        size -= 1;
        return ele;
    }

    /**
     * The size of the arraylist
     *
     * @return the size
     */
    public int size() //returns size
    {
        return size;
    }

    /**
     * Rotates the array to the right by k steps.
     *
     * @param k the number of steps to rotate right
     */
    public void rotate(int k) {
        T[] temp = (T[]) new Object[size];
        for (int i = 0; i < k; i++) {
            temp[i] = a[size - k + i];
        }
        for (int i = size - k - 1; i >= 0; i--) {
            a[i + k] = a[i];
        }
        for (int i = 0; i < k; i++) {
            a[i] = temp[i];
        }
    }

        /**
         * Dynamically grow the array with the size of the ArrayList
         */
        private void grow_array () //doubles size of array
        {
            int len = a.length;
            if (len == 0) {
                len++;
            }
            T[] temp = (T[]) new Object[len*2];
            for (int i = 0; i < a.length; i++) {
                temp[i] = a[i];
            }
            a = temp;
        }
    public String toString() {
        return "MyArrayList{" +
                "a=" + Arrays.toString(a) +
                ", size=" + size +
                '}';
    }
}