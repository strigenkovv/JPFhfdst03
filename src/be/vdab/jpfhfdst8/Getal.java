package be.vdab.jpfhfdst8;

public class Getal {
    private int x;

    public Getal(int a) {
        setX(a);
    }

    public void print() {
        IO.println(x);
    }

    public int absoluut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return x + a;
    }

    public float som(float a) {
        return x + a;
    }

    public double som(double a) {
        return x + a;
    }

    public void add(int a) {
        x += a;
    }

    public double toDouble() {
        return (double) x;
    }

    public int getX() {
        return x;
    }

    public void setX(int a) {
        x = a;
    }
}
