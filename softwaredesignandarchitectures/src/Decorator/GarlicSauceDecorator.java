package Decorator;

import Factory.Burger;

public class GarlicSauceDecorator extends BurgerDecorator {
    public GarlicSauceDecorator(Burger decoratedBurger) {
        super(decoratedBurger);
    }

    public String prepare() {
        return super.prepare() + " and Garlic Sauce";
    }
}
