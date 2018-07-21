package simple;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Cat World!" );

        Cat cat = new Cat("Dusya", 3);
        System.out.println("Cat name: " + cat.getName());
        System.out.println("Cat age: " + cat.getAge());
    }
}
