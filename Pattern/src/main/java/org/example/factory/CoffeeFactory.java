package org.example.factory;

public class CoffeeFactory {
//    public static Coffee createCoffee(String type) {
//        if (type == null) {
//            throw new IllegalArgumentException("Тип кофе не может быть пустым");
//        }
//        Coffee coffee;
//        switch (type.toLowerCase()) {
//            case "американо":
//                coffee = new Americano();
//                break;
//            case "эспрессо":
//                coffee = new Espresso();
//                break;
//            default:
//                throw new IllegalArgumentException("Неизвестный тип кофе");
//        }
//        return coffee;
 // }
public static Coffee createCoffee(CoffeeType coffeeType){
    Coffee coffee;
    switch (coffeeType){
        case AMERICANO: coffee = new Americano();
                break;
        case ESPRESSO: coffee = new Espresso();
               break;
            default:
                throw new IllegalArgumentException("Неизвестный тип кофе");
    }
    return coffee;
}
}
