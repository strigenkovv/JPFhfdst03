package be.vdab.jpfhfdst24;

import java.util.stream.LongStream;

public class ParallelStreamVoorbeeld {
    private static void zonderParallel(long aantal) {
        var start = System.nanoTime();

        long resultaat = LongStream.rangeClosed(1, aantal)
                                   .map(getal -> getal * getal)
                                   .sum();

        var duur = System.nanoTime() - start;

        IO.println("Sequential: " + resultaat);
        IO.println("Time: " + duur + " ns");
    }

    private static void metParallel(long aantal) {
        var start = System.nanoTime();

        long resultaat = LongStream.rangeClosed(1, aantal)
                                   .parallel()
                                   .map(getal -> getal * getal)
                                   .sum();

        var duur = System.nanoTime() - start;

        IO.println("Parallel: " + resultaat);
        IO.println("Time: " + duur + " ns");
    }

    void main() {
        zonderParallel(1_000_000);
        metParallel(1_000_000);
    }
}
