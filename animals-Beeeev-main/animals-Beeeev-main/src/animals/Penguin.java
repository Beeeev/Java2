package animals;

/**
 *
 * @author Levi
 */
public class Penguin extends Bird implements IWalk, IMakeSound, ISwim{

    public Penguin(int wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void walk() {
       System.out.println("I waddle");
    }

    @Override
    public void makeSound() {
        System.out.println("I caw or Squawk");
    }
    @Override
    public void swim() {
        System.out.println("I can also swim");
    }   
    @Override
    public String toString() {
        return super.toString();
    }
    
}
