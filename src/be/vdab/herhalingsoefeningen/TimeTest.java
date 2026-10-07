package be.vdab.herhalingsoefeningen;

public class TimeTest {
    static void main() {


        var hour1 = new Time(9, 40);
        var hour2 = new Time(10, 30);

        var hour3 = hour2.subtract(hour1);
        IO.println(hour3);

        var hour4 = hour1.add(hour2);
        IO.println(hour4);
    }
}


