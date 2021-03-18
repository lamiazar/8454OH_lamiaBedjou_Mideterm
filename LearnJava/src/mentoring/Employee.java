package mentoring;

public class Employee {
    String name;
    String email;
    String jobTitle;
    double salary;

    public Employee(String name, String email, String jobTitle, double salary) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void meeting(){
     System.out.println("we have daily meeting og 15-20 minutes");
 }

 public void print(){
     System.out.println("my name is "+name);
     System.out.println("my salary is "+salary);
     System.out.println("my email address is "+email);
 }


    }


