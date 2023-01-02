package app.product.subproduct;

import app.product.Product;

public class BurgerSet extends Product {
    private Hamburger hamburger;
    private Side side;
    private Drink drink;

    public BurgerSet(int id, String name, int price, int kcal, Hamburger hamburger, Side side, Drink drink) {
        super(id, name, price, kcal);
        this.hamburger = hamburger;
        this.side = side;
        this.drink = drink;
    }

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void setHamburger(Hamburger hamburger) {
        this.hamburger = hamburger;
    }

    public Side getSide() {
        return side;
    }

    public void setSide(Side side) {
        this.side = side;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }
}
