package ucu.teoria2;

import junit.framework.TestCase;

import ucu.Parse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Cadenas de texto entre comillas dobles, siguiendo las convenciones de Java: 
 */
public class TestCadenasTexto extends TestCase {

    Logger logger;
    protected void setUp() {
        logger = java.util.logging.Logger.getAnonymousLogger();
    }
    
    public void testCadenaTexto() {
        String value = "\"\"";
        logger.log(Level.INFO, value);
        TestCase.assertEquals(value, "\"\"", Parse.parse(value));
    }

    public void testCadenaTexto2() {
        String value = "\"abcde\"";
        logger.log(Level.INFO, value);
        TestCase.assertEquals(value, "\"abcde\"", Parse.parse(value));
    }

    public void testCadenaTexto3() {
        String value = "\"\n\\\u1234\"";
        logger.log(Level.INFO, value);
        TestCase.assertEquals(value, "\"\n\\ሴ\"", Parse.parse(value));
    }

}
