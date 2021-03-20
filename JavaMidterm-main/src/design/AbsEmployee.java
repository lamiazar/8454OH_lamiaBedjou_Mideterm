package design;

public abstract class AbsEmployee {
  String name;
  String address;
  int numberOfhours;
  private int ssn;
  private static double salary;

    public AbsEmployee(String name) {
        this.name = name;
    }

    public AbsEmployee(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public AbsEmployee(String name, String address, int numberOfhours) {
        this.name = name;
        this.address = address;
        this.numberOfhours = numberOfhours;
    }
    public AbsEmployee(){

    }
    public boolean isFullTimeEmployee(int numberOfhours){
        if(numberOfhours>40){
            return true;
        }
        return false;
    }

    public  void meeting(){
        System.out.println("In our team we have daily meetings");
    }


    public int getNumberOfhours(int numberOfhours) {
        System.out.println("I work "+numberOfhours+" hours a week");
        return numberOfhours;
    }

    public String getName() {
        return name;
    }


}
