package singleton;

/**
 * This service handles payment processing logic.
 *
 * It uses the Singleton Logger to record payment events.
 */
public class PaymentService {

    /**
     * Shared Logger instance (Singleton)
     */
    private Logger logger = Logger.getInstance();

    /**
     * Simulates payment processing.
     */
    public void processPayment() {
        logger.logInfo("Payment processed successfully");
        logger.logDebug("PaymentService: payment flow executed");
    }
}
