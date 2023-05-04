package animals;

/**
 *
 * @author Levi
 */
//abstract class so that you cant make a general "animal"
public abstract class Animal {
    
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "I am a " + name + ".";
    }
    
}
