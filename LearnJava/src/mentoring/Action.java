package mentoring;

public class Action {
    public static void main(String[] args) {
        QaTester qa=new QaTester("lamia",85.000,"lb@gmail.com","tester");
        qa.meeting();
        qa.typeOfEmployement(25);
        qa.print();
        System.out.println("**************************************************");
        AutomationTester au=new AutomationTester("azar",90.000,"az@gmail.com","automation tester");
        au.runScripts();
        au.meeting();
        au.print();    }
}
