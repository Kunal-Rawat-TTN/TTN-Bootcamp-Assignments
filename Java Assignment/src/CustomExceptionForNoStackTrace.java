class NoStackTraceException extends Exception {
    public NoStackTraceException(String message) {
        super(message);
    }

    // Override fillInStackTrace() to disable stack trace
    @Override
    public Throwable fillInStackTrace() {
        return null;
    }
}

// Demo class to test the custom exception
public class CustomExceptionForNoStackTrace {
    public static void main(String[] args) {
        try {
            throw new NoStackTraceException("Custom Exception Without Stack Trace!");
        } catch (NoStackTraceException e) {
            System.out.println("Exception Caught: " + e.getMessage());
            e.printStackTrace(); // Will not print a stack trace
        }
    }
}