# Cuboid
Cuboid class using Java Generics


### STEP 1:
- Insert a comment at the top of the code containing your name, the chapter number, lab number and the date the program was created.
- Create a generic class called Cuboid that will store the three dimensions of a cuboid. 
- Add methods to set and get the length, width and height. 
- Add a method public String toString() that will return all of the dimensions. 
- The type of the dimensions will be decided at construction of the cuboid instance. 

Example:  
Cuboid<Double> c1 = new Cuboid<>();  
Cuboid<String> c1 = new Cuboid<>();  
  
### STEP 2:
- Modify your generic class Cuboid so that it only accepts Numbers. 
- Add a method with the following definition and complete its body. 
- public double getVolume(){ ...... }
  - Hint: Look at the method doubleValue() in the Number class.

### Evaluation:

- 2 - General, compiles, comments, proper indentation, etc

Cuboid Class
- 1 - Implements generic types   
- 1 - Types limited to numbers  
- 1 - Stores three dimensions of type  
- 2 - Default and 3-parameter constructors  
- 1 - Getters and Setters for each dimension  
- 1 - getVolume() method that returns double  
-   1 - Uses doubleValue()  
- 1 - String toString() overridden (@notation)  


Driver Class  
- 2 - Creates two cuboids of two different types  
  - One with default constructor (use setters)  
  - One with three parameter constructor  
- 2 - toString() method tested for both cuboids  
- 2 - getVolume() method tested for both cuboids  
