package log;

import org.slf4j.Logger ;
import org.slf4j.LoggerFactory;
public class logback {

    private static final Logger logger = LoggerFactory.getLogger(logback.class);



    public static void main(String[] args) {

        logger.debug("33333");
        logger.info("dfsdsf");
        logger.warn("dfsdsf");

    }
}
