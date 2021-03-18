package composition.animals;

public class Cat {
    int age;
    double weight;
    String race;
    Domestic domestic;

    public Cat(int age, double weight, String race, Domestic domestic) {
        this.age = age;
        this.weight = weight;
        this.race = race;
        this.domestic = domestic;
    }


    public void Sleep(){
        System.out.println("cats love to sleep");
    }
    public void climb(){
        System.out.println("cats climbs a lot");
    }

    public Domestic getDomestic() {
        return domestic;
    }
}
