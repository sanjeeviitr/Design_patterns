package org.example.Singleton;

import java.util.concurrent.locks.ReentrantLock;

public class Logger {

    private static volatile Logger flogger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (flogger == null) {
            synchronized (Logger.class) {
                if (flogger == null) {
                    flogger = new Logger();
                }
            }
        }
        return flogger;
    }

    public void log(String msg) {
        System.out.println(msg);
    }


}
