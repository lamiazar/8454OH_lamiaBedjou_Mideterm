package mentoring;

public class QaTester extends Employee {



public QaTester(String name,double salary,String email,String jobTitle){
    super(name,email,"tester",salary);
}
  public void createTest(){
      System.out.println("One of my job duties is create test cases");
  }

    public void meeting() {
        super.meeting();
    }


    public void print() {
        System.out.println("my name is lamia and I'm a network engineer");
    }

    public QaTester(String name, String email, String jobTitle, double salary) {
        super(name, email, jobTitle, salary);
    }

    public void typeOfEmployement(int hours){
    if(hours==40){
        System.out.println("im a full time employee");

    }else{
        System.out.println("I'm a part time employee");
    }


  }

}