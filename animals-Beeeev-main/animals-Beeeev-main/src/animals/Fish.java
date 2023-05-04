package animals;

/**
 *
 * @author Levi
 */
//abstract class so that you cant make a general "fish"
public abstract class Fish extends Animal {
    private boolean isSaltWater;

    public Fish(boolean isSaltWater, String name) {
        super(name);
        this.isSaltWater = isSaltWater;
    }

    public boolean isIsSaltWater() {
        return isSaltWater;
    }

    public void setIsSaltWater(boolean isSaltWater) {
        this.isSaltWater = isSaltWater;
    }

    @Override
    public String toString() {
        return super.toString() + " Am I a Salt Water fish? " + isSaltWater;
    }
}
