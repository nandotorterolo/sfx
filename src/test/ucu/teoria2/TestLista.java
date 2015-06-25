package ucu.teoria2;

import junit.framework.TestCase;
import ucu.Parse;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Listas de valores entre paréntesis rectos (List):
 */
public class TestLista extends TestCase {

    Logger logger;
    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    public void testLista1() {
        String value = "[]";
        logger.log(Level.INFO, value);
        assertEquals(value, new ArrayList(), Parse.parse(value));
    }

    public void testLista2() {
        String value = "[1 2 3]";
        logger.log(Level.INFO, value);
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        assertEquals(value, list, Parse.parse(value));
    }

    public void testLista3() {
        String value = "[true \"a\" 1.1f]";
        logger.log(Level.INFO, value);
        ArrayList list = new ArrayList();
        list.add(true);
        list.add("\"a\"");
        list.add(1.1f);
        assertEquals(value, list, Parse.parse(value));
    }

    public void testLista4() {
        String value = "[[1 2 3] [4 [5] 6] [\"hola\"]]";
        logger.log(Level.INFO, value);
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList list2 = new ArrayList();
        list2.add(5);

        ArrayList list3 = new ArrayList();
        list3.add(4);
        list3.add(list2);
        list3.add(6);

        ArrayList list4 = new ArrayList();
        list4.add("\"hola\"");

        ArrayList list5 = new ArrayList();
        list5.add(list);
        list5.add(list3);
        list5.add(list4);

        assertEquals(value, list5, Parse.parse(value));
    }

    public void testLista5() {
        String value = "[1[2]]";
        logger.log(Level.INFO, value);
        ArrayList list = new ArrayList();
        list.add(2);
        ArrayList list2 = new ArrayList();
        list2.add(1);
        list2.add(list);

        assertEquals(value, list2, Parse.parse(value));
    }


}
