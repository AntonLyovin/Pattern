package org.example.proxy;

public class DatabaseProxy implements Database{
    private String dbName;
    private static final String BD_URL = "localhost:5432/";

    private RealDatabase realDatabase;

    public DatabaseProxy(String dbName) {
        this.dbName = dbName;
        this.realDatabase = new RealDatabase(dbName);
    }

    @Override
    public String getConnection() {
        String fullUrl = BD_URL + dbName;
        return "Подключение по адресу: " + fullUrl;
    }
}
