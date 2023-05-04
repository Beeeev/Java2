package animals;

/**
 *
 * @author Levi
 */
//abstract class so that you cant make a general "mammal"
public abstract class Mammal extends Animal {
    private int bodyTemp;

    public Mammal(int bodyTemp, String name) {
        super(name);
        this.bodyTemp = bodyTemp;
    }

    public int getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(int bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    @Override
    public String toString() {
        return super.toString() + " I have a body temp of " + bodyTemp + " degrees";
    }
    
}
