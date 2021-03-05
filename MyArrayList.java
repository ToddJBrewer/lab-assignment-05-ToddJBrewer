/**
 * An implementation of the ArrayList data structure
 * 
 * @author
 */
public class MyArrayList<T>
{
    protected T[] a;
    protected int size;

    /**
     * Constructor
     */
    public MyArrayList() //makes new array list and sets size at 0
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Adds an item to the end of the list
     * @param item the items to add
     */
    public void add(T item) //adds item to end of arraylist
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Adds an item to the list at a certain position
     * @param pos the position to add the item at
     * @param item the item to add
     */
    public void add(int pos, T item) //adds item at given position
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Gets the item at the position
     * @param pos position to get the item
     */
    public T get(int pos) // returns item at index
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Removes and returns the item at a position
     * @param pos the position to remove
     * @return the item at the position
     */
    public T remove(int pos) //returns item after removing it from arraylist
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * The size of the arraylist
     * @return the size
     */
    public int size() //returns size
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    /**
     * Rotates the array to the right by k steps.
     * @param k the number of steps to rotate right
     */
    public void rotate(int k)
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }
    /**
     * Dynamically grow the array with the size of the ArrayList
     */
    private void grow_array() //doubles size of array
    {
        throw new UnsupportedOperationException("Not yet implemented!");
    }

    public String toString()
    {
        String result = "";
        for(int i=0; i< a.length; i++)
        {
            result = result + a + " ";
        }
        return result;
    }
}