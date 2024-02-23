package Question2;

public class InvalidAgeForVoter extends RuntimeException {
    public InvalidAgeForVoter(final String message) {
        super(message);
    }
}
