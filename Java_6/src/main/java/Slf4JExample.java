import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Slf4JExample {

    //    private static Logger log = LoggerFactory.getLogger(Slf4jExample.class); Без Ломбока

    public static void main(String[] args) {
        log.debug("Debug log message");
        log.info("Info log message");
        log.error("Error log message");
    }
}
