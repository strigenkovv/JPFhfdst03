package be.vdab.jpfhfdst22;

public class InsectenMain {
    void main() {

        var klok = new Klok();
        var thread = new Thread(klok);

        thread.setDaemon(true);
        thread.start();

        IO.readln("Druk op Enter om te stoppen...");


        /*


        var klok = new Klok();
        var thread = new Thread(klok);

        thread.start();

        IO.readln();       // Wait for Enter.
        thread.interrupt();

        /*
        var klok = new Klok();
        var thread = new Thread(klok);

        thread.start();

       /* var lezer1 = new InsectenLezer(
                "D:/opleiding/data/insecten1.csv",
                System.out);

        var lezer2 = new InsectenLezer(
                "D:/opleiding/data/insecten2.csv",
                System.err);

        var thread1 = new Thread(lezer1);
        var thread2 = new Thread(lezer2);

        thread1.start();
        thread2.start();

        try {
            // Wait until both threads have finished.
            thread1.join();
            thread2.join();

            IO.println(
                    (lezer1.getAantalRegels()
                     + lezer2.getAantalRegels()) + " regels"
            );
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.err.println(ex);
        }

      /*  var lezer1 = new InsectenLezerThread(
                "D:/opleiding/data/insecten1.csv",
                System.out
        );

        var lezer2 = new InsectenLezerThread(
                "D:/opleiding/data/insecten2.csv",
                System.err
        );

        var thread1 = new Thread(lezer1);
        var thread2 = new Thread(lezer2);

        thread1.start();
        thread2.start();

        /*
        var thread1 = new InsectenLezer(
                "D:/opleiding/data/insecten1.csv",
                System.out
        );

        var thread2 = new InsectenLezer(
                "D:/opleiding/data/insecten2.csv",
                System.err
        );

        thread1.start();
        thread2.start();*/
    }
}
