package singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * This class represents a cache that stores feature flags.
 * 
 * A feature flag is simply a key-value pair:
 * - Key: String (feature name)
 * - Value: Boolean (enabled or disabled)
 * 
 * This class is implemented as a Singleton to ensure:
 * - Only ONE instance exists in the whole application
 * - All services use the SAME shared data
 */
public class FeatureFlagCache {
    
    /**
     * This map stores all feature flags.
     * Example:
     * "dark_mode" -> true
     * "new_checkout" -> false
     */
    private Map<String, Boolean> flags;

    /**
     * This is the SINGLE instance of the class.
     * It is static so it belongs to the class itself,
     * not to individual objects.
     */
    private static FeatureFlagCache instance;
    
    /**
     * Private constructor:
     * - Prevents other classes from creating new instances using "new"
     * - Ensures controlled object creation through getInstance()
     */
    private FeatureFlagCache() {
        // Load flags when the object is created
        flags = loadFlagsFromRemoteSource();
    }
    
    /**
     * Public method to check if a feature is enabled.
     * 
     * @param flagName the name of the feature
     * @return true if enabled, false otherwise
     */
    public boolean isEnabled(String flagName) {
        // If the flag does not exist, return false by default
        return flags.getOrDefault(flagName, false);
    }
    
    /**
     * Simulates loading feature flags from an external source.
     * 
     * In real systems, this could be:
     * - A database
     * - A remote API
     * - A configuration file (JSON, YAML, etc.)
     * 
     * @return a map containing feature flags
     */
    private Map<String, Boolean> loadFlagsFromRemoteSource() {
        System.out.println("Loading flags from remote source...");

        Map<String, Boolean> data = new HashMap<>();

        // Simulated feature flags
        data.put("dark_mode", true);
        data.put("new_checkout", false);
        data.put("beta_search", true);

        return data;
    }
    
    /**
     * This method provides access to the SINGLE instance.
     * 
     * - If the instance does not exist → create it
     * - If it already exists → return the same instance
     * 
     * This ensures:
     * - Only one object is created
     * - All parts of the system share the same instance
     */
    public static FeatureFlagCache getInstance(){
        if(instance == null){
            instance = new FeatureFlagCache();
        }
        
        return instance;
    }
}
