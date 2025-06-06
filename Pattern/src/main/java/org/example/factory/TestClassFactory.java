package org.example.factory;

public class TestClassFactory {
    public static void main(String[] args) {
        Coffee coffee1 = CoffeeFactory.createCoffee(CoffeeType.ESPRESSO);
        Coffee coffee2 = CoffeeFactory.createCoffee(CoffeeType.AMERICANO);
        coffee1.prepare();
        coffee2.prepare();
    }
}
