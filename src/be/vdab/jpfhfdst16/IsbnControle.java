package be.vdab.jpfhfdst16;

public class IsbnControle {
    private String isbn13;

    public void setIsbn13(String isbn13) {
        if (!isGeldigIsbn13(isbn13)) {
            throw new Isbn13Exception("Ongeldig ISBN13-nummer");
        }

        this.isbn13 = isbn13;
    }

    public String getIsbn13() {
        return isbn13;
    }

    private boolean isGeldigIsbn13(String isbn13) {
        if (isbn13 == null || isbn13.isBlank()) {
            return false;
        }

        var nummer = isbn13.replace("-", "");

        if (nummer.length() != 13) {
            return false;
        }

        for (var i = 0; i < nummer.length(); i++) {
            if (!Character.isDigit(nummer.charAt(i))) {
                return false;
            }
        }

        var som = 0;

        for (var i = 0; i < 12; i++) {
            var cijfer = Character.getNumericValue(nummer.charAt(i));

            if (i % 2 == 0) {
                som += cijfer;
            } else {
                som += cijfer * 3;
            }
        }

        var controleCijfer = 10 - (som % 10);

        if (controleCijfer == 10) {
            controleCijfer = 0;
        }

        var laatsteCijfer =
                Character.getNumericValue(nummer.charAt(12));

        return laatsteCijfer == controleCijfer;
    }
}
