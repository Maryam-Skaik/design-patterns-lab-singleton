package singleton;

/**
 * This service handles user-related operations.
 *
 * It uses the Singleton Logger to record user events.
 */
public class UserService {

    /**
     * Shared Logger instance (Singleton)
     */
    private Logger logger = Logger.getInstance();

    /**
     * Simulates user registration.
     */
    public void registerUser() {
        logger.logInfo("User registered successfully");
        logger.logDebug("UserService: registration flow executed");
    }
}
