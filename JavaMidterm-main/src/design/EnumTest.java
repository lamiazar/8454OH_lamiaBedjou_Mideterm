package design;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Months of the Year:");
        for (Months m : Months.values())
            System.out.println(m + " Month has  " + m.getDays() + " days");
    }
}

