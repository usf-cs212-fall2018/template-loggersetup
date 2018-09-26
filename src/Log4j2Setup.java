import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Setup {

	public static final Logger log = LogManager.getLogger();

	public static void logMessages() {
		log.trace("tucan");
		log.debug("dodo");
		log.info("ibis");
		log.warn("wren");
		log.error("egret", new Exception("urk"));
		log.fatal("finch", new Exception("ack"));
	}

	public static void main(String[] args) {
		logMessages();
	}

}
