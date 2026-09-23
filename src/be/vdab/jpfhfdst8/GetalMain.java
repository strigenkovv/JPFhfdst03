package be.vdab.jpfhfdst8;

public class GetalMain {
    void main() {

        var getal = new Getal(-45);

        IO.println("Beginwaarde:");
        getal.print();

        IO.println("Absolute waarde: " + getal.absoluut());

        IO.println("Som met int: " + getal.som(10));
        IO.println("Som met float: " + getal.som(10.5F));
        IO.println("Som met double: " + getal.som(10.5));

        getal.add(5);
        IO.println("Na add(5): " + getal.getX());

        IO.println("Als double: " + getal.toDouble());

        getal.setX(100);
        IO.println("Na setX(100): " + getal.getX());
    }
}
