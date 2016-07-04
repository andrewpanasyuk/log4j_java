import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by a_pan on 03.07.2016.
 */
public class Config {
    private static Properties logProperty = new Properties();
    private static String logFile;


    public Config(String logFile) {
        this.logFile = logFile;
    }

    public void init(){
        try {
            logProperty.load(new FileInputStream(logFile));
            PropertyConfigurator.configure(logProperty);

        } catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
