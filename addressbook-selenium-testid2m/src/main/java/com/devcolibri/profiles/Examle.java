package com.devcolibri.profiles;

import java.io.InputStream;
import java.util.Properties;

class Example {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        InputStream is = Example.class.getClassLoader().getResourceAsStream("develop/conf.properties");
        properties.load(is);

        System.out.println("Type of app: " + properties.getProperty("type"));
    }
}