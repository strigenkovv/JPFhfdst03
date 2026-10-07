package be.vdab.herhalingsoefeningen;

public class Time {
    private final int hour;
    private final int minute;

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public Time add(Time other) {
        int totalMinutes =
                hour * 60 + minute
                + other.hour * 60 + other.minute;

        return new Time(
                totalMinutes / 60,
                totalMinutes % 60
        );
    }

    public Time subtract(Time other) {
        int totalMinutes =
                hour * 60 + minute
                - (other.hour * 60 + other.minute);

        return new Time(
                totalMinutes / 60,
                totalMinutes % 60
        );
    }

    @Override
    public String toString() {
        return hour + ":" + String.format("%02d", minute);
    }
}
