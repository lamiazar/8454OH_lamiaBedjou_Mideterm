package composition.rooms;

public class Fridge {
    private String color;
    private String manufacture;
    int doors;
    private int maxTemp;
    private int Capacity;

    public Fridge(String color, String manufacture, int doors, int maxTemp, int Capacity) {
        this.color = color;
        this.manufacture = manufacture;
        this.doors = doors;
        this.maxTemp = maxTemp;
        this.Capacity = Capacity;
    }

    public void addItems(){

        System.out.println("we can add items to the fridge");
    }
    public void setTemp(){

        System.out.println("set the fridge to the correct temperature");
    }

    public int getCapacity(){
        return Capacity;
    }
    public String getManufacture(){
        return manufacture;
    }
    public String getColor(){
        return color;
    }

    public void setMaxTemp(int maxTemp) {

        this.maxTemp = maxTemp;
    }
}
