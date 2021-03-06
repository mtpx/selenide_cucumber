package utils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Reader {
    public String urlPrograms;
    public String urlEvaluation;


    public void environmentPropertiesLoader() throws IOException {

        Properties prop = new Properties();
        String propFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        if (inputStream == null) {
            throw new FileNotFoundException("Property File '" + propFileName + "' not found in the classpath");
        }
        prop.load(inputStream);
        urlPrograms = prop.getProperty("urlPrograms");
        urlEvaluation = prop.getProperty("urlEvaluation");

        inputStream.close();
    }
}