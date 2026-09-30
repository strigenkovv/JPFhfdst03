package be.vdab.jpfhfdst22.pannenkoeken;

public class MainKok {
    void main() {
        var stapel = new Stapel();

        var thread1 = Thread.startVirtualThread(
                new Kok(stapel));

        var thread2 = Thread.startVirtualThread(
                new Kok(stapel));

        /*
        var thread1 = new Thread(new Kok(stapel));
        var thread2 = new Thread(new Kok(stapel));*/

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

            IO.println(stapel.getAantalPannenkoeken());

        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println(ex);
        }
    }
}
