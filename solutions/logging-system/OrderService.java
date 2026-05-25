package singleton;

/**
 * This service handles order processing logic.
 *
 * It uses the Singleton Logger to record system events.
 */
public class OrderService {

    /**
     * Shared Logger instance (Singleton)
     */
    private Logger logger = Logger.getInstance();

    /**
     * Simulates placing an order.
     */
    public void placeOrder() {
        logger.logInfo("Order placed successfully");
        logger.logDebug("OrderService: order flow executed");
    }
}
