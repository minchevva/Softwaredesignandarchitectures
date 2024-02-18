package Singleton;

public class Restaurant {
    private static Restaurant instance = null;

    private Restaurant() {
        System.out.println("Restaurant is opened!");
    }

    public static Restaurant getInstance() {
        if (instance == null)
            instance = new Restaurant();
        return instance;
    }
}
