package midtermreview;

// write a class animal that has attributes for name and sound
// have a method makeSound that returns name of the animal and 
//   the sound the animal makes
// include set and get methods for name and sound
// have a constructor that accepts values for name and sound
public class Animal {

    private String name;
    private String sound;
    
    public Animal(String name, String sound) {
        setName(name);
        setSound(sound);
    }
    
    public String makeSound(){
        return name + " " + sound;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public void setSound(String sound) {
        this.sound = sound;
    }
    
    public String getSound() {
        return sound;
    }
    
}
