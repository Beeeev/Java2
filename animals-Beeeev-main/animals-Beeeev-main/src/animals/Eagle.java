package animals;

/**
 *
 * @author Levi
 */
public class Eagle extends Bird implements IFly, IMakeSound, IWalk {

    public Eagle(int wingspan, String name) {
        super(wingspan, name);
    }

    @Override
    public void fly() {
        System.out.println("I am a bird that can fly and represents freedom");
    }

    @Override
    public void makeSound() {
        System.out.println("I make high pitched whistling sounds");
    }
     @Override
    public void walk() {
        System.out.println("I can also walk");
    }
    

    @Override
    public String toString() {
        return super.toString();
    }
}
