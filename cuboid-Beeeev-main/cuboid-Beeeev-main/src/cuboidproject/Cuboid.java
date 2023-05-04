package cuboidproject;

//generic class type that extends Number so it is restricted
public class Cuboid<T extends Number> {
    //vars for class
    private T length;
    private T width;
    private T height;

    //loaded const
    public Cuboid(T length, T width, T height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    //default cons
    public Cuboid() {
    }
   
    //getters and setters
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }
    
    //gets volume of cuboid by using generic types but converting them to doubles
    public double getVolume()
    {
        double volumeOfCuboid = length.doubleValue() * width.doubleValue() * height.doubleValue();
        return volumeOfCuboid;
    }
    //toString to display values
    @Override
    public String toString() {
        return "Length: " + length + " " +"Width: " + width + " " + "Height: " + height;
    }

   
    
    
}
