package com.burger;

public class HesBurger extends Burger{
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public HesBurger(String breadRollType, String meat, double price) {
        super(breadRollType, meat, price);
    }

    public Addition getAddition1() {
        return addition1;
    }

    public Addition getAddition2() {
        return addition2;
    }

    public Addition getAddition3() {
        return addition3;
    }

    public Addition getAddition4() {
        return addition4;
    }

    public void setAddition1(Addition addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(Addition addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(Addition addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(Addition addition4) {
        this.addition4 = addition4;
    }

    @Override
    public double totalPrice() {
        return super.getPrice() + addition1.getPrice() + addition2.getPrice() + addition3.getPrice() + addition4.getPrice();
    }

    public double totalPrice(double hamBurgerPrice) {
        return super.getPrice();
    }

    public double totalPrice(double hamBurgerPrice, double additionPrise1) {
        return super.getPrice() + additionPrise1;
    }

    public double totalPrice(double hamBurgerPrice, double additionPrise1, double additionPrise2) {
        return super.getPrice() + additionPrise1 + additionPrise2;
    }
    public double totalPrice(double hamBurgerPrice, double additionPrise1, double additionPrise2, double additionPrise3) {
        return super.getPrice() + additionPrise1 + additionPrise2 + additionPrise3;
    }

}
