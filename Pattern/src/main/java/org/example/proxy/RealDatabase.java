package org.example.proxy;

public class RealDatabase implements Database{
    private String dbName;

    public RealDatabase(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public String getConnection() {
        return  dbName;
    }
}
