package cuboidproject;

//Levi Bevins
//CIT265
//2/20/2023
//Ch19
//Lab 1
//Assignment Finished

public class CuboidProject {

    
    public static void main(String[] args) {
        //Add code here to fully test your Cuboid Class.
        //Be sure to test all constructors and methods.
        
        //cuboid obj made with param const
        Cuboid c1 = new Cuboid<>(13, 12, 11);
        //cuboid obj made with no param const and added values with setters
        Cuboid c2 = new Cuboid<>();
        c2.setLength(14);
        c2.setWidth(13);
        c2.setHeight(12);
        
        //print obj
        
        System.out.println(c1.toString());
        System.out.println(c1.getVolume());
        //print obj
        System.out.println(c2.toString());
        System.out.println(c2.getVolume());
    }
    
}
