package animals;

/**
 *
 * @author Levi
 */
public class Dolphin extends Mammal implements ISwim, IMakeSound {

    public Dolphin(int bodyTemp, String name) {
        super(bodyTemp, name);
    }

    @Override
    public void swim() {
        System.out.println("I can swim very fast");
    }

    @Override
    public void makeSound() {
        System.out.println("I make whistle and click sounds");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
