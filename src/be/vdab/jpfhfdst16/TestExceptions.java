package be.vdab.jpfhfdst16;

public class TestExceptions {

    void main() {
        var test = "yes";

        try {
            IO.println("start try");
            doRisky(test);
            IO.println("end try");
        }
        catch (ScaryException ex) {
            IO.println("scary exception");
        }
        finally {
            IO.println("finally");
        }

        IO.println("end of main");
    }

    static void doRisky(String test) throws ScaryException {
        IO.println("start risky");

        if ("yes".equals(test)) {
            throw new ScaryException();
        }

        IO.println("end risky");
    }
}
