package com.banking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

    public Properties pro;
    public ReadConfig() {

        File src = new File(".\\Configuration\\config.properties");
        pro = new Properties();
        try {
            FileInputStream fis = new FileInputStream(src);
            pro.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

        public String getChromeDriveUrl(){
           return pro.getProperty("chromeDriverPath");
        }

        public String getBaseurl(){
         return pro.getProperty("baseUrl");
        }

        public String getUserName(){
        return  pro.getProperty("userName");
        }

        public String getPassword(){
        return pro.getProperty("password");
        }

}

