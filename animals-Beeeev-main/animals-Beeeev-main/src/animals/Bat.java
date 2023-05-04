package animals;

/**
 *
 * @author Levi
 */
public class Bat extends Mammal implements IFly, IMakeSound{

    public Bat(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void fly() {
        System.out.println("I am a small brown or gray flying animal");
    }

    @Override
    public void makeSound() {
        System.out.println("I make sounds that humans can have a hard time hearing");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
 
}
