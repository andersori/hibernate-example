package com.dvn.util;

import java.util.Map;

import com.github.shyiko.dotenv.DotEnv;

public class ConstantEnv{
    
    private static String DATABASE_CONFIG_DIRECTORY;

    private ConstantEnv(){
        
    }

    static {
        Map<String, String> dotEnv = DotEnv.load();
        ConstantEnv.DATABASE_CONFIG_DIRECTORY = dotEnv.get("DATABASE_CONFIG_DIRECTORY");
    }

    public static String getDatabaseConfigDirectory(){
        return ConstantEnv.DATABASE_CONFIG_DIRECTORY;
    }
    
}