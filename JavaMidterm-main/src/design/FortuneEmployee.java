package design;

public class FortuneEmployee {

    public static void main(String[] args) {
        EmployeeInfo e=new EmployeeInfo();
        System.out.println(e.isFullTimeEmployee(36));
        System.out.println(e.getNumberOfhours(40));
        e.vacation();
        EmployeeInfo.calculateEmployeeBonus(75.000,5);
        EmployeeInfo.calculateEmployeePension();
        System.out.println(e.generateEmailAddress());

    }

}
