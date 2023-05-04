package animals;

/**
 *
 * @author Levi
 */
public class Ostrich extends Bird implements IWalk, IMakeSound{

    public Ostrich(int wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void walk() {
      System.out.println("I can run very fast!");
    }

    @Override
    public void makeSound() {
        System.out.println("I make a sound called a boom");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
