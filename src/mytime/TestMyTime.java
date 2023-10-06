package mytime;



public class TestMyTime {
    public static void main(String[] args) {
        new TestMyTime().run();
    }

    private void run() {
        MyTime myTime = new MyTime(9, 25, 2023, "October", 4);
        System.out.println(myTime.getDayOfWeek());
        System.out.println(myTime.getYear());
        System.out.println(myTime.timeAsString());
        myTime.isLeapYear();

}
}
