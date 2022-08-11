import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Logging {

    private static final Logger log = Logger.getLogger(Logging.class.getName());

    public static void main(String[] args) {

        log.info("First log");

        List<Integer> list = null;
        try {
            list.size();
        } catch (NullPointerException ex) {
            log.log(Level.WARNING, "Your collection is null!", ex);
        }

        if (list == null) {
            log.log(Level.WARNING, "Your collection is null!");
        } else {
            list.size();
        }
    }
}
