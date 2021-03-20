package design;

import java.util.Scanner;

public class EmployeeInfo  extends AbsEmployee implements Employee {
    static String companyName;
    private static double salary;
    private static double bonus;
    private static double numYearEmployment;
    private String department;
    private int id;
    private String benefit;
    private int wage;

    public EmployeeInfo() {

    }
    public EmployeeInfo(String name, String companyName) {
        super(name);
    }
    public EmployeeInfo(String name, String address, int numberOfhours, String benefit, int empId) {
        this.name="lamia";
        this.address="504 Dier rd,Ohio";

    }
    @Override
    public void meeting() {
        System.out.println("I participate in daily meetings");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public  void vacation(){
        System.out.println("I have a 15 days payed vacation");
    }

    public static double calculateEmployeeBonus(double salary, int numYearEmployment) {
     bonus=0;
    if (numYearEmployment>= 10) {
       bonus = salary* 0.10;
        System.out.println("I'm getting a bonus of : "+bonus);
    } else if (numYearEmployment >= 5 &&(numYearEmployment<10)) {
        bonus = salary*00.5;
        System.out.println("I'm getting a bonus of : "+bonus);
    } else {
       bonus = 0;
       System.out.println("Bonus is not applied");
    }
		return bonus;
}
    public static double calculateEmployeePension() {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter start date in format (example: May,2015): ");
        String joiningDate = sc.nextLine();
        System.out.println("Please enter today's date in format (example: August,2017): ");
        String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
        int startDate=Integer.parseInt(joiningDate);
        int nowDate=Integer.parseInt(todaysDate);
        numYearEmployment=nowDate-startDate;
        if (numYearEmployment > 3) {
            result = (salary * 0.20);
        } else if (numYearEmployment == 2) {
            result = (salary * 0.10);
        } else if (numYearEmployment == 1) {
            result =(salary * 0.05);
        } else if (numYearEmployment == 0) {
            result = 0;
        }
        return result;
    }
    @Override
    public void assignDepartment() {
        System.out.println(department);
    }

    @Override
    public int employeeId() {
        return id;
    }

    @Override
    public String employeeName() {
        return name;
    }

    @Override
    public int calculateSalary() {
        return (int) (numberOfhours*wage*52);
    }

    @Override
    public void benefitLayout() {
        System.out.println(benefit);
    }
}
  class DateConversion {
        public static String convertDate(String date) {
            String[] extractMonth = date.split(",");
            String givenMonth = extractMonth[0];
            int monthDate = whichMonth(givenMonth);
            String actualDate = monthDate + "/" + extractMonth[1];
            return actualDate;
        }
        public static int whichMonth(String givenMonth) {
            Months months = Months.valueOf(givenMonth);
            int date = 0;
            switch (months) {
                case January:
                    date = 1;
                    break;
                case February:
                    date = 2;
                    break;
                case March:
                    date = 3;
                    break;
                case April:
                    date = 4;
                    break;
                case May:
                    date = 5;
                    break;
                case June:
                    date = 6;
                    break;
                case July:
                    date = 1;
                    break;
                case August:
                    date = 1;
                    break;
                case September:
                    date = 1;
                    break;
                case October:
                    date = 1;
                    break;
                case November:
                    date = 1;
                    break;
                case December:
                    date = 1;
                    break;
                default:
                    date = 0;
                    break;
            }
            return date;

        }
    }

