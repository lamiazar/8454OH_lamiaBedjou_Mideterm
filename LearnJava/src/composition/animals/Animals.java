package composition.animals;

public class Animals {
    Lion lion;
    Horse horse;
    Cat cat;
    Domestic domestic;

    public Animals(Lion lion, Horse horse, Cat cat) {
        this.lion = lion;
        this.horse = horse;
        this.cat = cat;
        this.domestic=domestic;
    }
}
