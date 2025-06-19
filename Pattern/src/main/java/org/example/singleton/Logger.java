package org.example.singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

    private static Logger instance;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void classLogg(Object obj, String info) {
        String date = new SimpleDateFormat("dd.MM.yy").format(new Date());
        String className = obj.getClass().getSimpleName();
        System.out.println("Log info: " + date + " - " + className + " - " + info);
    }
}
