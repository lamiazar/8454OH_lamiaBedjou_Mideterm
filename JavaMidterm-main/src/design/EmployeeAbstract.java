package design;

public abstract class EmployeeAbstract {
  String name;
  String address;
  int numberOfhours;
  private int ssn;
  private static double salary;

    public EmployeeAbstract(String name) {
        this.name = name;
    }

    public EmployeeAbstract(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public EmployeeAbstract(String name, String address, int numberOfhours) {
        this.name = name;
        this.address = address;
        this.numberOfhours = numberOfhours;
    }
    public EmployeeAbstract(){

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
