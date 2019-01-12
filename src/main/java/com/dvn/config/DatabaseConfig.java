package com.dvn.config;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.dvn.util.ConstantEnv;

public class DatabaseConfig{

    private static String drive;
    private static String url;
    private static String user;
    private static String password;
    private static String dialect;

    private DatabaseConfig(){

    }

    static{

        try {
			FileReader file = new FileReader(ConstantEnv.getDatabaseConfigDirectory());
			BufferedReader reader = new BufferedReader(file);
            
            String line = null;

            line = reader.readLine();
            DatabaseConfig.drive = (line != null) ? line : "UNDEFINED";

            line = reader.readLine();
            DatabaseConfig.url = (line != null) ? line : "UNDEFINED";

            line = reader.readLine();
            DatabaseConfig.user = (line != null) ? line : "UNDEFINED";

            line = reader.readLine();
            DatabaseConfig.password = (line != null) ? line : "UNDEFINED";

            line = reader.readLine();
            DatabaseConfig.dialect = (line != null) ? line : "UNDEFINED";
            
            file.close();
            reader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
    }

    public static String getDrive(){
        return DatabaseConfig.drive;
    }

    public static String getUrl(){
        return DatabaseConfig.url;
    }

    public static String getUser(){
        return DatabaseConfig.user;
    }

    public static String getPassword(){
        return DatabaseConfig.password;
    }

    public static String getDialect(){
        return DatabaseConfig.dialect;
    }

}