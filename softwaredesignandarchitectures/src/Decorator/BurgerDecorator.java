package Decorator;

import Factory.Burger;

public class BurgerDecorator implements Burger {
    protected Burger decoratedBurger;

    public BurgerDecorator(Burger decoratedBurger) {
        this.decoratedBurger = decoratedBurger;
    }

    public String prepare() {
        return decoratedBurger.prepare();
    }
}
