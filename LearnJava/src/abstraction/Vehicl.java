package abstraction;

public abstract class Vehicl {
    String type;
    String name;

    public Vehicl(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public abstract void hasEngine();
     public void turnOn(){
         System.out.println("the vehicl turns on");
     }
     final  void drive(){

     }



}
