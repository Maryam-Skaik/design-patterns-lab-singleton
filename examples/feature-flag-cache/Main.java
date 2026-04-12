package singleton;

/**
 * Entry point of the application.
 * 
 * This class demonstrates:
 * - How services use the Singleton
 * - That only one instance is created
 */
public class Main {
    
    public static void main(String[] args) {

        /**
         * Create service objects.
         * 
         * Each service internally uses FeatureFlagCache,
         * but they do NOT create new instances.
         */
        CheckoutService checkout = new CheckoutService();
        SearchService search = new SearchService();

        // Execute service logic
        checkout.processCheckout();
        search.search();

        /**
         * Verify Singleton behavior
         * 
         * Both variables should point to the SAME instance
         */
        FeatureFlagCache c1 = FeatureFlagCache.getInstance();
        FeatureFlagCache c2 = FeatureFlagCache.getInstance();

        // This should print "true"
        System.out.println("Same instance? " + (c1 == c2));
    }
}
