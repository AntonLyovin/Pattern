package org.example.proxy;

public class DatabaseProxy implements Database {
    private String dbName;

    private RealDatabase realDatabase;

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
        this.realDatabase = new RealDatabase(dbName);
    }

    @Override
    public String getConnection() {
        return realDatabase.getConnection();
    }
}
