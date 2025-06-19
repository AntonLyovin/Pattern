package org.example.proxy;

public class DatabaseProxy implements Database {
    private Database realDatabase;
    private static final String BASE_URL = "http://localhost:8080/";



    public DatabaseProxy(String dbName) {
        this.realDatabase = new RealDatabase(dbName);
    }

    @Override
    public String getConnection() {
        String dbName = realDatabase.getConnection();
        return BASE_URL + dbName;
    }
}
