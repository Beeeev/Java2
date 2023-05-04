package animals;

/**
 *
 * @author Levi
 */
//abstract class so that you cant make a general "bird"
public abstract class Bird extends Animal {
    private int wingspan;

    public Bird(int wingspan, String name) {
        super(name);
        this.wingspan = wingspan;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return super.toString() + " I have a wingspan of " + wingspan + "ft"; 
    }
    
}
