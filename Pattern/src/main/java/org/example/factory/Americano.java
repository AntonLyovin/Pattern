package org.example.factory;

public class Americano extends Coffee {
    @Override
    public void prepare() {
        System.out.println("Готовка американо начата");
    }
}
