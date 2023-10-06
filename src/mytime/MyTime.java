package mytime;

public class MyTime {
    private int hours;
    private int minutes;
    private String str_hours;
    private String str_minutes;
    private String month;
    private int date;
    private int year;

    public MyTime(int hours, int minutes, int year, String month, int date) {
        this.hours = hours;
        this.minutes = minutes;
        this.year = year;
        this.month = month;
        this.date = date;


    }

    public int getYear() {
        return year;
    }

    public String timeAsString() {
        str_hours = String.valueOf(hours);
        str_minutes = String.valueOf(minutes);
        if (str_hours.length() < 2)
            str_hours = '0' + str_hours;
        if (str_minutes.length() < 2)
            str_minutes = '0' + str_minutes;

        return (hours + ":" + minutes);
    }

    public void isLeapYear() {
        int currentYear = getYear();

        if (currentYear % 4 == 0)
            System.out.println("Current year is a leap year!");
        else
            System.out.println("Current year is NOT a leap year");


    }

    public String getDayOfWeek() {
        int monthValue = parseMonth(month);
        int day = date;
        int yearLastTwoDigits = year % 100;
        int yearFirstTwoDigits = year / 100;

        // Zeller's Congruence formula
        int h = (day + ((13 * (monthValue + 1)) / 5) + yearLastTwoDigits + (yearLastTwoDigits / 4) +
                (yearFirstTwoDigits / 4) - (2 * yearFirstTwoDigits)) % 7;

        String[] daysOfWeek = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String dayOfWeek = daysOfWeek[h];
         return  dayOfWeek;

    }

    private int parseMonth(String month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < monthNames.length; i++) {
            if (monthNames[i].equalsIgnoreCase(month)) {
                return i + 1;
            }
        }
        return -1; // Invalid month
    }
}
