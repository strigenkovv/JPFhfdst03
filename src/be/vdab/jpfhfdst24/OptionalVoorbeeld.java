package be.vdab.jpfhfdst24;

import java.util.Optional;

public class OptionalVoorbeeld {

    private static Optional<Integer> eersteCijfer(String string) {
        for (int index = 0; index < string.length(); index++) {
            var teken = string.charAt(index);

            if (Character.isDigit(teken)) {
                return Optional.of(
                        Character.getNumericValue(teken)
                );
            }
        }

        return Optional.empty();
    }

    void main() {
        eersteCijfer("all4you")
                .ifPresent(cijfer -> IO.println(cijfer * 10));

        eersteCijfer("wrong")
                .ifPresent(cijfer -> IO.println(cijfer * 10));
    }

}