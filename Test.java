/**
 * Program to test your code in
 * 
 * @author
 */
public class Test
{
    /**
     * Main function to run tests
     * @param args command arg line
     */
    public static void main(String[] args) //change to test code
    {
        //test constructor
        MyArrayList<String> a1 = new MyArrayList<String>();

        //testing add
        a1.add("1");
        a1.add("2");
        a1.add("3");
        a1.add("4");
        a1.add("5");
        System.out.println(a1);

        //testing add2
        a1.add(0, "12");
        System.out.println(a1);

        //testing get
        System.out.println(a1.get(1));
        
        //testing remove
        System.out.println(a1.remove(0));
        System.out.println(a1);

        //testing size
        System.out.println(a1.size());

        //testing rotate
        a1.rotate(2);
        System.out.println(a1);
    }
}