package org.example.factory;

public class Espresso extends Coffee{
    @Override
    public void prepare() {
        System.out.println("Готовка эспрессо начата");
    }
}
