package lesson17;

public class UncurrentAgeException2 extends Exception {

    public UncurrentAgeException2() {
    }

    public UncurrentAgeException2(String message) {
        super(message);
    }

    public UncurrentAgeException2(String message, Throwable cause) {
        super(message, cause);
    }

    public UncurrentAgeException2(Throwable cause) {
        super(cause);
    }

    public UncurrentAgeException2(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
