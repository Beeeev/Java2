package animals;

/**
 *
 * @author Levi
 */
public class Shark extends Fish implements ISwim{

    public Shark(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("I can swim very fast");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
