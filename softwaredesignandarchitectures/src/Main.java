import Command.Cashier;
import Command.ChefOrder;
import Decorator.GarlicSauceDecorator;
import Decorator.KetchupDecorator;
import Factory.Burger;
import Factory.Kitchen;
import Singleton.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = Restaurant.getInstance();
        Kitchen kitchen = new Kitchen();
        Cashier cashier = new Cashier();
        ChefOrder order = new ChefOrder(kitchen, "royal");
        cashier.setOrder(order);
        cashier.giveOrder();
        Burger burger = order.getBurger();
        Burger decoratedBurger = new GarlicSauceDecorator(new KetchupDecorator(burger));
        System.out.println("Final product: " + decoratedBurger.prepare());
    }
}