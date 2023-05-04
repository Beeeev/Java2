package animals;

/**
 *
 * @author Levi
 */
public class Bass extends Fish implements ISwim{

    public Bass(boolean isSaltWater, String name) {
        super(isSaltWater, name);
    }

    @Override
    public void swim() {
      System.out.println("I am fish that can swim and a part of the sunfish family");
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
}
