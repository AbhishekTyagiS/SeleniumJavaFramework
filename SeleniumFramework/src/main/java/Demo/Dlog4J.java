package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Dlog4J {
	
	static Logger logger = LogManager.getLogger(Dlog4J.class);
	

	public static void main(String[] args) {
		
		
		System.out.println("\n hello World......! \n");
		
		logger.trace("This is trace message");

		logger.info("This is info message");
		logger.error("This is a error message");

		logger.warn("This is a warning message");

		logger.fatal("This is a fatal message");
		
		System.out.println("\n Completed");
	}

}
