package animals;

/**
 *
 * @author Levi
 */
public class Lion extends Mammal implements IWalk, IMakeSound {

    public Lion(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void walk() {
        System.out.println("I can run very fast for a large cat");
    }

    @Override
    public void makeSound() {
        System.out.println("I roar and growl");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
