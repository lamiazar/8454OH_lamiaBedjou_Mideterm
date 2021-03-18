package composition.rooms;

public class Swiffer {
    boolean isElectric;
    String manufacture;
    int voltage;
    boolean needaWater;

    public Swiffer(boolean isElectric, String manufacture, int voltage, boolean needaWater) {
        this.isElectric = isElectric;
        this.manufacture = manufacture;
        this.voltage = voltage;
        this.needaWater = needaWater;
    }

    public void getManufacture() {
        this.manufacture = manufacture;
    }

    public void turnOn() {
        System.out.println("turn on the swiffer");
    }
    public void plug(){
        if(isElectric){
            System.out.println("plug the swiffer");
        }
    }

    public void mapFloor() {
        if (needaWater) {
            System.out.println("add water to the swiffer");
        } else {

            System.out.println("the swiffer is full");
        }
        plug();
        turnOn();
    }
}

