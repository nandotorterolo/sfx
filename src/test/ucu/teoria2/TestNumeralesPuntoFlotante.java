package ucu.teoria2;

import junit.framework.TestCase;
import java.util.logging.Level;
import java.util.logging.Logger;
import ucu.Parse;

/**
 * Created by fernando on 25/06/15.
 *
 * Numerales enteros y de punto flotante, siguiendo las convenciones de Java:
 */
public class TestNumeralesPuntoFlotante extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }
    public void testInt1() {
        String value = "1";
        logger.log(Level.INFO, value);
        assertEquals(value, new Integer(1), Parse.parse(value));
    }

    public void testInt123() {
        String value = "123";
        logger.log(Level.INFO, value);
        assertEquals(value, new Integer(123), Parse.parse(value));
    }

    public void testInt_4() {
        String value = "-4";
        logger.log(Level.INFO, value);
        assertEquals(value, new Integer(-4), Parse.parse(value));
    }

    public void testIntMas15() {
        String value = "+15";
        logger.log(Level.INFO, value);
        assertEquals(value, new Integer(15), Parse.parse(value));
    }

    public void testLong10L() {
        String value = "10l";
        logger.log(Level.INFO, value);
        assertEquals(value, new Long(10), Parse.parse(value));
    }

    public void testLong_1234567879L() {
        String value = "-1234567879L";
        logger.log(Level.INFO, value);
        assertEquals(value, new Long(-1234567879), Parse.parse(value));
    }

    public void testDouble11() {
        String value = "1.1";
        logger.log(Level.INFO, value);
        assertEquals(value, new Double(1.1), Parse.parse(value));
    }

    public void testDouble1e_123() {
        String value = "-1.23";
        logger.log(Level.INFO, value);
        assertEquals(value, new Double(-1.23), Parse.parse(value));
    }

    public void testDouble1eE123() {
        String value = "+1e23";
        logger.log(Level.INFO, value);
        assertEquals(value, new Double(1e23), Parse.parse(value));
    }

    public void testDouble1d() {
        String value = "1d";
        logger.log(Level.INFO, value);
        assertEquals(value, new Double(1), Parse.parse(value));
    }

    public void testDouble01D() {
        String value = "0.1D";
        logger.log(Level.INFO, value);
        assertEquals(value, new Double(0.1), Parse.parse(value));
    }

    public void testFloat1f() {
        String value = "1f";
        logger.log(Level.INFO, value);
        assertEquals(value, new Float(1), Parse.parse(value));
    }

    public void testFloat0010F() {
        String value = "0.010F";
        logger.log(Level.INFO, value);
        assertEquals(value, new Float(0.010), Parse.parse(value));
    }

    public void testFloat_1e_2f() {
        String value = "-1e-2f";
        logger.log(Level.INFO, value);
        assertEquals(value, new Float(-1e-2), Parse.parse(value));
    }

    public void testHexInt() {
        String value = "0xCAFE";
        logger.log(Level.INFO, value);
        assertEquals(value, new Integer(51966), Parse.parse(value));
    }

    public void testHexLong() {
        String value = "0xC4F3L";
        logger.log(Level.INFO, value);
        assertEquals(value, new Long(50419), Parse.parse(value));
    }

}
