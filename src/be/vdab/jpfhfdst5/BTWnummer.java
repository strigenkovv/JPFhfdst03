package be.vdab.jpfhfdst5;

public class BTWnummer {
    void main() {
        int btwNummer = 213252520;
        int deeltal = btwNummer / 100;
        byte rest = (byte) (deeltal % 97);
        byte laatste2Cijfers = (byte) (btwNummer % 100);
        IO.println(laatste2Cijfers == 97 - rest);
    }
}
