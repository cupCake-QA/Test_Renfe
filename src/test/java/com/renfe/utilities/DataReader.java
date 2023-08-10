package com.renfe.utilities;

import java.io.FileInputStream;
import java.util.Properties;


/**
* reads the properties file testData.properties
*/
public class DataReader {

   private static Properties properties;

   static {

       try {
           String path = "testData.properties";
           FileInputStream input = new FileInputStream(path);
           properties = new Properties();
           properties.load(input);

           input.close();
       } catch (Exception e) {
           e.printStackTrace();

       }
   }

   public static String get(String keyName) {
       return properties.getProperty(keyName);
   }


}
