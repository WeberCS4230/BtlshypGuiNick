package gui;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import main.btlshyp.Main;
import main.btlshyp.controller.Controller;

public class runGui {

	private final static Logger logger = LoggerFactory.getLogger(Main.class);
	private static final String LOG_FORMAT = "%1$tY-%1$tm-%1$td %1$tH:%1$tM:%1$tS %4$-6s [%2$s] %5$s%6$s%n";

	public static void main(String[] args) {
		System.setProperty("java.util.logging.SimpleFormatter.format", LOG_FORMAT);
		logger.info("Application Starting");

		Gui gui = new Gui();
		Controller controller = new Controller(gui);
		controller.init();
		controller.playGame();
	}

}
