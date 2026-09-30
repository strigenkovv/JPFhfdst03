package be.vdab.jpfhfdst24;

public class Test {

    void main() {
        EvenGetallen evenGetallen =
                getal -> getal % 2 == 0;

        IO.println(evenGetallen.isEven(7));
        IO.println(evenGetallen.isEven(8));
    }
}
