package ucu.teoria2;

import junit.framework.TestCase;

import ucu.Parse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Diccionarios definidos con pares clave:valor entre llaves (Map).   
 */
public class TestDiccionarios extends TestCase {

    Logger logger;
    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    public void testMap() {
        String value = "{}";
        logger.log(Level.INFO, value);
        HashMap map = new HashMap<String, String>();
        assertEquals(value, map, Parse.parse(value));
    }

    public void testMap2() {
        String value = "{1:\"1\" \"2\":2} ";
        logger.log(Level.INFO, value);
        HashMap map = new HashMap<Object, Object>();
        map.put(1, "\"1\"");
        map.put("\"2\"", 2);
        assertEquals(value, map, Parse.parse(value));
    }

    public void testMap3() {
        String value  = "{\"a\": {\"b\":1 \"c\":[2]}}";
        logger.log(Level.WARNING, value);
        HashMap map = new HashMap<Object, Object>();
        HashMap map2 = new HashMap<Object, Object>();
        ArrayList list = new ArrayList();
        list.add(2);
        map2.put("\"b\"", 1);
        map2.put("\"c\"", list);
        map.put("\"a\"", map2);
        assertEquals(value, map, Parse.parse(value));
    }

}
