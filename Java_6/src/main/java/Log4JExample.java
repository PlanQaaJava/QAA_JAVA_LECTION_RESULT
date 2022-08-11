import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Log4JExample {

    private static final Logger logger = LogManager.getLogger();

    public static void main(String[] args) {

        logger.info("Log4j2ExampleApp started.");
        logger.warn("Something to warn");
        logger.error("Something failed.");
        logger.debug("Something debug.");

        try {
            Files.readAllBytes(Paths.get("/file/does/not/exist"));
        } catch (IOException ioex) {
            logger.error("Error message", ioex);
        }
    }
}
