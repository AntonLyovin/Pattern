package org.example.singleton;

public class TestClassSingleton {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.classLogg(new TestClassSingleton(), "Some info");
    }
}
