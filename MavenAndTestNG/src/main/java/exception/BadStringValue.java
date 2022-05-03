package exception;

/**
 * Исключение в случае наличия некорректного символа
 */
public class BadStringValue extends RuntimeException {

    public BadStringValue(String message) {
        super(message);
    }
}
