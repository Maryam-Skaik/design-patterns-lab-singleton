package singleton;

/**
 * Entry point of the application.
 *
 * This class demonstrates:
 * - Centralized logging using Singleton
 * - Shared Logger instance across services
 */
public class Main {

    public static void main(String[] args) {

        /**
         * Create service objects.
         * Each service uses the SAME Logger instance.
         */
        OrderService orderService = new OrderService();
        PaymentService paymentService = new PaymentService();
        UserService userService = new UserService();

        // Execute service operations
        orderService.placeOrder();
        paymentService.processPayment();
        userService.registerUser();

        /**
         * Verify Singleton behavior
         */
        Logger l1 = Logger.getInstance();
        Logger l2 = Logger.getInstance();

        System.out.println("Same Logger instance? " + (l1 == l2));
    }
}
