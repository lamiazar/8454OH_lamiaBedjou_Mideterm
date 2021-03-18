package composition.animals;

public class Domestic {
     int HoursSleep;


    public Domestic(int hoursSleep) {
        HoursSleep = hoursSleep;
    }

    public void makeSound(){
        System.out.println(" cat makes a lot of noise");
    }
    public void play(){
        System.out.println("animals love to play");
    }
}
