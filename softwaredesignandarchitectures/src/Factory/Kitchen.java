package Factory;

public class Kitchen {
    public Burger createBurger(String type) {
        switch (type) {
            case "royal":
                return new RoyalBurger();
            case "classic":
                return new ClassicBurger();
            case "veggie":
                return new VeggieBurger();
            default:
                return null;
        }
    }
}
