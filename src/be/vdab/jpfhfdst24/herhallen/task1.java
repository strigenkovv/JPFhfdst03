package be.vdab.jpfhfdst24.herhallen;

import java.util.Comparator;
import java.util.List;

public class task1 {
    void main() {

        /*var getallen = List.of(12, 5, 8, 21, 4, 15, 10);

        getallen.stream()
                .filter(getal -> getal % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        var woorden = List.of(
                "Java", "Spring", "SQL",
                "Angular", "Git", "Docker"
        );

        IO.println(woorden.stream().
                filter(getal -> getal.length() > 4)
                .mapToInt(lengthW -> lengthW.length())
                .sum());*/


        var getallen2 = List.of(2, 3, 4, 5);

        getallen2.stream().reduce(
                         (vorigeSum, getaal) -> {
                             var newS = vorigeSum + getaal;

                             IO.println(newS);
                             return newS;
                         }
                 )
                 .ifPresent(System.out::println);

        IO.println(
                getallen2.stream()
                         .reduce(0, (vorigeSum, getal) -> vorigeSum + getal)
        );

        IO.println(getallen2.stream().reduce(0, Integer::sum));
    }
}
