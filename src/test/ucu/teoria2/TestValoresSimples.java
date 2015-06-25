package ucu.teoria2;

import junit.framework.TestCase;

import ucu.Parse;
import org.junit.Assert;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Valores simples expresados con palabras reservadas:
 */
public class TestValoresSimples extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    public void testTrue() {
        String value = "true";
        logger.log(Level.INFO, value);
        Assert.assertEquals(value, true, Parse.parse(value));
    }

    public void testFalse() {
        String value = "false";
        logger.log(Level.INFO, value);
        Assert.assertEquals(value, false, Parse.parse(value));
    }

    public void testNull() {
        String value = "null";
        logger.log(Level.INFO, value);
        Assert.assertEquals(value, null, Parse.parse(value));
    }


}
