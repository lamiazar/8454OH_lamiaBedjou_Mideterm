package composition.rooms;

public class Dishwasher {
    int washCycle;
    int capacity;
    boolean isNotfull;

    public Dishwasher(int washCycle, int capacity, boolean isNotfull) {
        this.washCycle = washCycle;
        this.capacity = capacity;
        this.isNotfull = isNotfull;
    }
    public void getCapacity(){
        this.capacity=100;
        System.out.println("my dishwasher has "+capacity+" capacity");
    }

    public void addDish(){
        if(isNotfull){
            System.out.println("I can add a dish to wash");}
            else{
            System.out.println("my dishwasher is full");
            }
        addSoap();
        washSetup(2);
        }
    public void addSoap(){
        System.out.println("add soap to the dishwasher");
    }
    public void washSetup(int option){
        System.out.println("Select wash option: ");
        switch (option) {
            case 1:
                System.out.println("Pots button selected");
                break;
            case 2:
                System.out.println("Lightwash button selected");
                break;
            case 3:
                System.out.println("oneHourWash button selected");
                break;
            default:
                System.out.println("choose an option ");
        }
        System.out.println("dishwasher can start working");
        }
    }

