package animals;

/**
 *
 * @author Levi
 */
public class FlyingFish extends Fish implements ISwim, IFly{

    public FlyingFish(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
        System.out.println("I am a fish that can swim");
    }

    @Override
    public void fly() {
       System.out.println("But I am also a fish that can fly!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
