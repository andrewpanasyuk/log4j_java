import config.Res;
import org.apache.log4j.Logger;

/**
 * Created by a_pan on 03.07.2016.
 */
public class Start {
    private static Logger log = Logger.getLogger(Start.class);

    public static void main(String[] args) {
        Config config = new Config(Res.Log.LOG_FILE_PROPERTIES);
        config.init();
        log.info("Hi!");
        log.error("O!", new Exception() );
    }
}
