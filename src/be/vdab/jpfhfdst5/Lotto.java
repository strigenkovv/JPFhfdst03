package be.vdab.jpfhfdst5;

import java.util.Arrays;

public class Lotto {
    void main() {
        var lottoGetallen = new int[7];
        var aantal = 0;

        while (aantal < lottoGetallen.length) {
            var nieuwGetal = (int) (Math.random() * 42) + 1;
            var bestaatAl = false;

            for (var i = 0; i < aantal; i++) {
                if (lottoGetallen[i] == nieuwGetal) {
                    bestaatAl = true;
                    break;
                }
            }

            if (!bestaatAl) {
                lottoGetallen[aantal] = nieuwGetal;
                aantal++;
            }
        }

        Arrays.sort(lottoGetallen);

        for (var getal : lottoGetallen) {
            IO.println(getal);
        }
    }
}
