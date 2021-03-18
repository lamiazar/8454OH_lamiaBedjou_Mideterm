package mentoring;

public class AutomationTester extends QaTester {
    public AutomationTester(String name, double salary, String email, String jobTitle) {

        super(name, salary, email, "AutomationTester");
    }


    public void print() {
        System.out.println("my name is "+name);
        System.out.println("my salary is : " +salary+" $");

    }


    public void meeting() {
        super.meeting();
    }

    public void runScripts()
    {
        System.out.println("as an automation tester I create scripts");
    }
}

