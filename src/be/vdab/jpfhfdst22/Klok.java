package be.vdab.jpfhfdst22;

import java.time.LocalTime;

public class Klok implements Runnable {

    @Override
    public void run() {
        while (true) {
            IO.println(LocalTime.now());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
    } /*

    public void run() {
        var verderDoen = true;

        while (verderDoen) {
            IO.println(LocalTime.now());

            if (Thread.interrupted()) {
                verderDoen = false;
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                verderDoen = false;
            }
        }
    }*/
}