package com.demo;

public class ExtraVeggies extends BasePizza{
    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }
}
