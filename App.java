package week05_01202024;

public class App {

	public static void main(String[] args) {
		Logger logger = new AsteriskLogger();
		
		logger.log("Sarah");
		logger.error("Tired");
	
		Logger logger1 = new SpacedLogger();
	
		logger1.log("Brian");
		logger1.error("kids");
	}
	
}
