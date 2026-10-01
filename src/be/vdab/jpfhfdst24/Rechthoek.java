package be.vdab.jpfhfdst24;

public class Rechthoek {
    private final int lengte;
    private final int breedte;

    public Rechthoek(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }

    public int getLengte() {
        return lengte;
    }

    public int getBreedte() {
        return breedte;
    }

    public int getOppervlakte() {
        return lengte * breedte;
    }
}
