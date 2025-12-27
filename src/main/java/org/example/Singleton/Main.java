package org.example.Singleton;

public class Main {
    public static void main(String[] args) {

//        Singleton Pattern ensures that a class has only one instance and provides a global access point to it, typically used when a single shared object is required to maintain consistency across the application.

//        Logger l1 = Logger.getInstance();
//        Logger l2 = Logger.getInstance();
//
//        for(int i=0;i<1e7; i++){
//            Logger.getInstance().log("logging" + i);
//        }
//
//        l1.log("First log");
//        l2.log("Second log");
//
//        System.out.println(l1.hashCode());
//        System.out.println(l2.hashCode());

        ConfigManager config = ConfigManager.getInstance();
        System.out.println(config.getValue("db.timeout"));
    }
}
