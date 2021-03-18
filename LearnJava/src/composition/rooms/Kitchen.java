package composition.rooms;

public class Kitchen {
  Fridge fridge;
  Oven oven;
  Microwave  microwave;
  Dishwasher dishwacher;
  Swiffer swiffer;
  String typeOfappliance;

    public Kitchen(Fridge fridge, Oven oven, Microwave microwave, Dishwasher dishwacher, Swiffer swiffer, String typeOfappliance) {
        this.fridge = fridge;
        this.oven = oven;
        this.microwave = microwave;
        this.dishwacher = dishwacher;
        this.swiffer = swiffer;
        this.typeOfappliance = typeOfappliance;
    }
}
