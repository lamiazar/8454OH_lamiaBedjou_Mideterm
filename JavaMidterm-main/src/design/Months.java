package design;

public enum Months {
    January(31), February(28), March(31), April(30), May(31), June(30),
    July(30), August(31), September(30), October(31), November(30), December(31);
    private int days;
    Months(int numOfDays) {
        days = numOfDays;
    }
    int getDays() {
        return days;
    }
}
