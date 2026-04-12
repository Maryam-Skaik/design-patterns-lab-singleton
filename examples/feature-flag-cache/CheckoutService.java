package singleton;

/**
 * This class represents a service responsible for handling checkout logic.
 * 
 * It depends on FeatureFlagCache to decide which checkout flow to use.
 */
public class CheckoutService {

    /**
     * Instead of creating a new FeatureFlagCache,
     * we use the Singleton instance.
     * 
     * This ensures:
     * - No duplicate caches are created
     * - All services share the same data
     */
    private FeatureFlagCache cache = FeatureFlagCache.getInstance();
    
    /**
     * Simulates processing a checkout operation.
     * 
     * The behavior depends on the "new_checkout" feature flag.
     */
    public void processCheckout() {
        // Check if the new checkout feature is enabled
        if (cache.isEnabled("new_checkout")) {
            System.out.println("Using NEW checkout flow");
        } else {
            System.out.println("Using OLD checkout flow");
        }
    }
}
