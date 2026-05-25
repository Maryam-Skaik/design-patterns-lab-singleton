package singleton;

import java.time.LocalDateTime;

/**
 * This class represents a centralized Logger system.
 *
 * It is implemented as a Singleton to ensure:
 * - Only ONE logger instance exists in the system
 * - All services share the same logging behavior
 * - Logs are consistent and centralized
 */
public class Logger {

    /**
     * This is the SINGLE instance of the Logger class.
     */
    private static Logger instance;

    /**
     * Private constructor:
     * - Prevents creating multiple instances using "new"
     */
    private Logger() {
        System.out.println("Logger initialized...");
    }

    /**
     * Provides access to the SINGLE Logger instance.
     *
     * - If instance is null → create it
     * - Otherwise → return existing instance
     */
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    /**
     * Logs a simple message with timestamp and level INFO.
     *
     * @param message the message to log
     */
    public void logInfo(String message) {
        System.out.println("[INFO] " + LocalDateTime.now() + " - " + message);
    }

    /**
     * Logs an error message with timestamp.
     *
     * @param message the error message
     */
    public void logError(String message) {
        System.out.println("[ERROR] " + LocalDateTime.now() + " - " + message);
    }

    /**
     * Logs a debug message with timestamp.
     *
     * @param message the debug message
     */
    public void logDebug(String message) {
        System.out.println("[DEBUG] " + LocalDateTime.now() + " - " + message);
    }
}
