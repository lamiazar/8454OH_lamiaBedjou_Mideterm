package composition.rooms;

public class Oven {
    int heatingTime;
    String manufacture;
    boolean isOn;
    boolean isConventional;

    public Oven(int heatingTime, String manufacture, boolean isOn, boolean isConventional) {
        this.heatingTime = heatingTime;
        this.manufacture = manufacture;
        this.isOn = isOn;
        this.isConventional = isConventional;
    }

    public void broil(){
            System.out.println("the oven is on mode Broil");
        }
        public void hotAir(){
            System.out.println("My oven use dry heat to sterilize");
    }
    public int heatTime(){
        return heatingTime;
    }
}

