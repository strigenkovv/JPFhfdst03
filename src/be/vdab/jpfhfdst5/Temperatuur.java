package be.vdab.jpfhfdst5;

public class Temperatuur {
    void main() {
        float tempCelsius = 37.0F;

        float tempFahr = tempCelsius * 9 / 5 + 32;

        IO.println("Temperatuur in graden Celsius: " + tempCelsius);
        IO.println("Temperatuur in graden Fahrenheit: " + tempFahr);
    }
}
