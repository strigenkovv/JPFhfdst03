package be.vdab.jpfhfdst16;

public class IsbnControleChecked {

    public void controleer(String isbn) throws IsbnCheckedException {
        if (isbn == null || isbn.isBlank()) {
            throw new IsbnCheckedException("ISBN mag niet leeg zijn");
        }
    }
}
