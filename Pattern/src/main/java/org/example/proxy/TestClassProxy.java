package org.example.proxy;

public class TestClassProxy {
    public static void main(String[] args) {
        Database db = new DatabaseProxy("MyDB");
        System.out.println(db.getConnection());

        Database db2 = new RealDatabase("MyDB2");
        System.out.println(db2.getConnection());
    }
}
