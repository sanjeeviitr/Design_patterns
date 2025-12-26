package org.example.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {

    private static volatile ConfigManager fmanager;
    private final Map<String, String> configMap;

    private ConfigManager(){
        this.configMap = new HashMap<>();
        loadConfig();
    }
    public static ConfigManager getInstance() {
        if(fmanager == null){
            synchronized (ConfigManager.class){
                if(fmanager == null){
                    fmanager = new ConfigManager();
                }
            }
        }
        return fmanager;
    }

    private void loadConfig(){
        configMap.put("db.timeout", "30");
        configMap.put("db.name", "db1");
        configMap.put("db.retry", "3");
    }

    public String getValue(String key){
        return configMap.get(key);
    }
}
