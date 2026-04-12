package singleton;

/**
 * This class represents a service responsible for search functionality.
 * 
 * It uses FeatureFlagCache to decide which search behavior to use.
 */
public class SearchService {

    /**
     * Access the shared Singleton instance.
     * 
     * This ensures:
     * - Consistent feature flags across services
     * - No duplication of data
     */
    private FeatureFlagCache cache = FeatureFlagCache.getInstance();

    /**
     * Simulates a search operation.
     * 
     * The behavior depends on the "beta_search" feature flag.
     */
    public void search() {
        // Check if beta search is enabled
        if (cache.isEnabled("beta_search")) {
            System.out.println("Using BETA search");
        } else {
            System.out.println("Using NORMAL search");
        }
    }
}
