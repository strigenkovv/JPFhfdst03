package be.vdab.jpfhfdst20.equalsdemo;

import java.util.HashSet;
import java.util.Set;

public class EqualsTest {
    void main() {

        var p1 = new Persoon("Anna");
        var p2 = new Persoon("Anna");

        // Compare two different objects.
        IO.println("== : " + (p1 == p2));
        IO.println("equals: " + p1.equals(p2));

        // Default hashCode() inherited from Object.
        IO.println("Hash p1: " + p1.hashCode());
        IO.println("Hash p2: " + p2.hashCode());

        // HashSet does not allow duplicates.
        Set<Persoon> personen = new HashSet<>();

        personen.add(p1);
        personen.add(p2);

        IO.println("Set size: " + personen.size());

        var p3 = new Persoon("FB");
        var p4 = new Persoon("Ea");

        IO.println("Hash p3: " + p3.hashCode());
        IO.println("Hash p4: " + p4.hashCode());
        IO.println("equals: " + p3.equals(p4));

        Set<Persoon> collisionTest = new HashSet<>();

        collisionTest.add(p3);
        collisionTest.add(p4);

        IO.println("Set size: " + collisionTest.size());
    }
}