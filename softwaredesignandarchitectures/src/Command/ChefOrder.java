package Command;

import Factory.Burger;
import Factory.Kitchen;

public class ChefOrder  implements Order {
    private Kitchen kitchen;
    private String type;
    private Burger burger;

    public ChefOrder(Kitchen kitchen, String type) {
        this.kitchen = kitchen;
        this.type = type;
    }

    public void execute() {
        System.out.println("Chef receives order for " + type + " burger...");
        burger = kitchen.createBurger(type);
        System.out.println("Chef prepares " + burger.prepare());
    }

    public Burger getBurger() {
        return burger;
    }
}
