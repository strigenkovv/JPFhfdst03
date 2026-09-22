package be.vdab.jpfhfdst5;

public class Bmi {

    public static void main(String[] args) {
        float gewicht = 75.7F;
        float lengte = 1.70F;
        float bmi = gewicht / (lengte * lengte);
        IO.println("De bodymassindex is " + bmi);
    }
}
