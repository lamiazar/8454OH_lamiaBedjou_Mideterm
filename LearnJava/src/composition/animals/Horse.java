package composition.animals;

public class Horse {
    String color;
    private String Race;
    private double weight;
    int age;

    public Horse(String color, String race, double weight, int age) {
        this.color = color;
        Race = race;
        this.weight = weight;
        this.age = age;
    }

    public void RunFast(){
        System.out.println("the horse can run for many miles");
    }

    public String getRace() {
        return Race;
    }

    public double getWeight() {
        return weight;
    }
}
