package design_pattern_behavioral.chain_of_responsibility_pattern.example;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityEverydayDemo {
    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityEverydayDemo.class.getName());

    static void main() {
        logger.setLevel(Level.FINER);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINER);
        logger.addHandler(consoleHandler);

        logger.finest("Finest level of logging");
        logger.finer("Finer level, but not as fine as finest");
        logger.fine("Fine, but not as fine as finer or finest");
    }
}
