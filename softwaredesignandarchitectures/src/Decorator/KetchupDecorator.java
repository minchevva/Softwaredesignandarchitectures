package Decorator;

import Factory.Burger;

public class KetchupDecorator extends BurgerDecorator {
    public KetchupDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public String prepare() {
        return super.prepare() + " with Ketchup";
    }
}
