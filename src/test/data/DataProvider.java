package test.data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class DataProvider {

    private static Properties properties = new Properties();
    private static final String filePath = System.getProperty("user.dir")+"\\data.properties";
    private static FileReader file;
    public static HashMap<String, String> dataFromProperties = new HashMap<>();

    public static void loadIntoHashMap(){
        try {
            try{
                file = new FileReader(filePath);
            }
            catch (FileNotFoundException e){
                e.printStackTrace();
            }
            BufferedReader reader = new BufferedReader(file);
            properties.load(reader);
            reader.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        for(String key: properties.stringPropertyNames()){
            String value = properties.getProperty(key);
            dataFromProperties.put(key, value);
        }
    }
}
