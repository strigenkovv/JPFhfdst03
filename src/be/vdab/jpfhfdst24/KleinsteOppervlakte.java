package be.vdab.jpfhfdst24;

import java.util.List;

public class KleinsteOppervlakte {
    void main() {
        var rechthoeken = List.of(
                new Rechthoek(6, 2), // 12
                new Rechthoek(3, 4), // 12
                new Rechthoek(5, 4), // 20
                new Rechthoek(2, 6)  // 3
        );

        rechthoeken.stream()
                   .mapToInt(Rechthoek::getOppervlakte)
                   .min()
                   .ifPresent(kleinste -> {
                       IO.println("Kleinste oppervlakte: " + kleinste);

                       rechthoeken.stream()
                                  .filter(r -> r.getOppervlakte() == kleinste)
                                  .forEach(r ->
                                                   IO.println("Lengte: " + r.getLengte()
                                                              + ", breedte: " + r.getBreedte())
                                  );
                   });
    }
}
