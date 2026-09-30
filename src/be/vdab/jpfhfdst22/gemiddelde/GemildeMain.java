package be.vdab.jpfhfdst22.gemiddelde;

import java.util.Random;

public class GemildeMain {
    public static void main(String[] args) {
        // Create one million random numbers.
        var getallen = new double[1_000_000];
        var random = new Random();

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = random.nextDouble();
        }

        // Divide the work into two equal parts.
        var rekenaar1 = new GemiddeldeRekenaar(
                getallen, 0, 500_000);

        var rekenaar2 = new GemiddeldeRekenaar(
                getallen, 500_000, 1_000_000);

        var thread1 = new Thread(rekenaar1);
        var thread2 = new Thread(rekenaar2);

        thread1.start();
        thread2.start();

        try {
            // Wait for BOTH calculations to finish.
            thread1.join();
            thread2.join();

            double gemiddelde =
                    (rekenaar1.getGemiddelde()
                     + rekenaar2.getGemiddelde()) / 2;

            System.out.println("Gemiddelde: " + gemiddelde);

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println(ex);
        }
    }
}
