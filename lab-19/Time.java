// 1. Define Time class with hour and minute as data member. Also define addition method to add two-time objects. (A)

public class Time {
    int hour;
    int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time t) {
        int totalMins = this.minute + t.minute;
        int extraHour = totalMins / 60;
        int finalMins = totalMins % 60;

        int totalHours = this.hour + t.hour + extraHour;

        return new Time(totalHours, finalMins);
    }

    public void display() {
        System.out.println("Time: " + hour + " hrs and " + minute + " mins");
    }

    public static void main(String[] args) {
        Time t1 = new Time(2, 45);
        Time t2 = new Time(1, 30);

        System.out.print("First Time - ");
        t1.display();
        System.out.print("Second Time - ");
        t2.display();

        Time result = t1.add(t2);
        System.out.print("Sum - ");
        result.display();
    }
}
