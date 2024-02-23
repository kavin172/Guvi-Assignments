package Question1;

public class NameNotValidException extends RuntimeException {
    public NameNotValidException(final String message) {
        super(message);
    }
}
