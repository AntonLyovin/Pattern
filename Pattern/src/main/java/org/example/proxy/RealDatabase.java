package org.example.proxy;

public class RealDatabase implements Database{
    private String dbName;
    private static final String BD_URL = "localhost:5432/";

    public RealDatabase(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String getConnection() {
        return "Подключение к БД: " + BD_URL + dbName;
    }
}
