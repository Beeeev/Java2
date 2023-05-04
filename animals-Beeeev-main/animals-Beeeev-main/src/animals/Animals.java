package animals;
import java.util.ArrayList;

/**
 * Author:Levi Bevins
 * Chapter:13
 * Lab:1
 */
public class Animals {

   
    public static void main(String[] args) {
        
        //creating each animal obj
        Ostrich ostrich = new Ostrich(6, "Ostrich");
        Penguin penguin = new Penguin(2, "Penguin");
        Eagle eagle = new Eagle(6, "Eagle");
        Bat bat = new Bat(100, "Bat");
        Lion lion = new Lion(101, "Lion");
        Dolphin dolphin = new Dolphin(97, "Dolphin");
        Shark shark = new Shark(true, "Shark");
        Bass bass = new Bass(false, "Bass");
        FlyingFish flyingfish = new FlyingFish(true, "Flying Fish");
        
        //add all animals to list
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(ostrich);
        animals.add(penguin);
        animals.add(eagle);
        animals.add(bat);
        animals.add(lion);
        animals.add(dolphin);
        animals.add(shark);
        animals.add(bass);
        animals.add(flyingfish);
        
        //loop each animal and print them to console
        System.out.println("Animal List: ");
        for(Animal animal:animals)
        {
            System.out.println(animal.toString());
        }
        
        //this is repeated for each Class and interface
        //interfaces call ToString to show what animal and the methods in the interface
        
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(ostrich);
        birds.add(penguin);
        birds.add(eagle);
        
        System.out.println("Bird List: ");
        for(Bird bird:birds)
        {
            System.out.println(bird.toString());
        }
        
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(dolphin);
        mammals.add(lion);
        mammals.add(bat);
        
        System.out.println("Mammal List: ");
        for(Mammal mammal:mammals)
        {
            System.out.println(mammal.toString());
        }
        
        
        ArrayList<Fish> fishes = new ArrayList<>();
        fishes.add(shark);
        fishes.add(bass);
        fishes.add(flyingfish);
        
        System.out.println("Fishes List: ");
        for(Fish fish:fishes)
        {
            System.out.println(fish.toString());
        }
        
        
        ArrayList<IWalk> walkers = new ArrayList<>();
        walkers.add(ostrich);
        walkers.add(penguin);
        walkers.add(lion);
        walkers.add(eagle);
        
        System.out.println("Walkers List: ");
        for(IWalk walker:walkers)
        {
            System.out.println(walker.toString());
            walker.walk();
        }
        
        ArrayList<IFly> flyers = new ArrayList<>();
        flyers.add(eagle);
        flyers.add(bat);
        flyers.add(flyingfish);
        
        System.out.println("Flyers List: ");
        for(IFly flyer:flyers)
        {
            System.out.println(flyer.toString());
            flyer.fly();
        }
        
        ArrayList<ISwim> swimmers = new ArrayList<>();
        swimmers.add(penguin);
        swimmers.add(dolphin);
        swimmers.add(shark);
        swimmers.add(bass);
        swimmers.add(flyingfish);
        
        System.out.println("Swimmers List: ");
        for(ISwim swimmer:swimmers)
        {
            System.out.println(swimmer.toString());
            swimmer.swim();
        }
        
        ArrayList<IMakeSound> soundmakers = new ArrayList<>();
        soundmakers.add(ostrich);
        soundmakers.add(lion);
        soundmakers.add(penguin);
        soundmakers.add(bat);
        soundmakers.add(dolphin);
        soundmakers.add(eagle);
        
        System.out.println("Soundmakers List: ");
        for(IMakeSound soundmaker:soundmakers)
        {
            System.out.println(soundmaker.toString());
            soundmaker.makeSound();
        }
        
    }
    
}
