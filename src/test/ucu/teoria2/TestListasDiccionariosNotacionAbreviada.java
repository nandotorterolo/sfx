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
 * Notación abreviada de listas de diccionarios:
 * {"x":0 "y":1 | "x":1 "y":0 | "x":0 "y":1}    Equivalente a: [{"x":0 "y":1} {"x":1 "y":0} {"x":0 "y":1}].
 * {"a":true | "b":false "c":1.2}               Equivalente a: [{"a":true} {"b":false "c":1.2}].
 * {| "x":77 |}                                 Equivalente a: [{} {"x":77} {}].
 */
public class TestListasDiccionariosNotacionAbreviada extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    /**
     * {"x":0 "y":1 | "x":1 "y":0 | "x":0 "y":1} Equivalente a: [{"x":0 "y":1} {"x":1 "y":0} {"x":0 "y":1}]
     */
    public void testLista1() {
        String value = "{\"x\":0 \"y\":1 | \"x\":1 \"y\":0 | \"x\":0 \"y\":1}";

        logger.log(Level.INFO, value);

        HashMap map1 = new HashMap<Object, Object>();
        map1.put("\"x\"", 0);
        map1.put("\"y\"", 1);

        HashMap map2 = new HashMap<Object, Object>();
        map2.put("\"x\"", 1);
        map2.put("\"y\"", 0);

        HashMap map3 = new HashMap<Object, Object>();
        map3.put("\"x\"", 0);
        map3.put("\"y\"", 1);
        ArrayList listRes = new ArrayList();
        listRes.add(map1);
        listRes.add(map2);
        listRes.add(map3);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

    /**
     * {"a":true | "b":false "c":1.2}               Equivalente a: [{"a":true} {"b":false "c":1.2}].
     */
    public void testLista2() {
        String value = "{\"a\":true | \"b\":false \"c\":1.2}";

        logger.log(Level.INFO, value);

        HashMap map1 = new HashMap<Object, Object>();
        map1.put("\"a\"", true);

        HashMap map2 = new HashMap<Object, Object>();
        map2.put("\"b\"", false);
        map2.put("\"c\"", 1.2);

        ArrayList listRes = new ArrayList();
        listRes.add(map2);
        listRes.add(map1);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

    /**
     * {| "x":77 |}                                 Equivalente a: [{} {"x":77} {}].
     */
    public void testLista3() {
        String value = "{| \"x\":77 |}";

        logger.log(Level.INFO, value);

        HashMap map1 = new HashMap<Object, Object>();

        HashMap map2 = new HashMap<Object, Object>();
        map2.put("\"x\"", 77);

        HashMap map3 = new HashMap<Object, Object>();

        ArrayList listRes = new ArrayList();
        listRes.add(map1);
        listRes.add(map2);
        listRes.add(map3);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

}
