package ucu.teoria2;

import junit.framework.TestCase;
import ucu.Parse;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 *
 * Notación abreviada de listas dentro de listas:
 * 1 -> [1 2 | 3 4 | 5 6]       Equivalente a: [[1 2] [3 4] [5 6]].
 * 2 -> [1 2 | 3 | | 4 5 6]     Equivalente a: [[1 2] [3] [] [4 5 6]].
 * 3 -> [| true |]              Equivalente a: [[] [true] []].
 * 4 -> [|]                     Equivalente a: [[] []].
 * 5 -> [| [1 2] | 3]           Equivalente a: [[] [[1 2]] [3]].
 */
public class TestListasNotacionAbreviada extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
    }

    /**
     * * 1 -> [1 2 | 3 4 | 5 6]       Equivalente a: [[1 2] [3 4] [5 6]].
     */
    public void testLista1() {
        String value = "[1 2 | 3 4 | 5 6]";

        logger.log(Level.INFO, value);

        ArrayList list12 = new ArrayList();
        list12.add(1);
        list12.add(2);

        ArrayList list34 = new ArrayList();
        list34.add(3);
        list34.add(4);

        ArrayList list56 = new ArrayList();
        list56.add(5);
        list56.add(6);

        ArrayList listRes = new ArrayList();
        listRes.add(list12);
        listRes.add(list34);
        listRes.add(list56);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

    /**
     * * 2 -> [1 2 | 3 | | 4 5 6]     Equivalente a: [[1 2] [3] [] [4 5 6]].
     */
    public void testLista2() {
        String value = "[1 2 | 3 | | 4 5 6]";

        logger.log(Level.INFO, value);

        ArrayList list12 = new ArrayList();
        list12.add(1);
        list12.add(2);

        ArrayList list3 = new ArrayList();
        list3.add(3);

        ArrayList listVacia = new ArrayList();

        ArrayList list456 = new ArrayList();
        list456.add(4);
        list456.add(5);
        list456.add(6);

        ArrayList listRes = new ArrayList();
        listRes.add(list12);
        listRes.add(list3);
        listRes.add(listVacia);
        listRes.add(list456);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }


    /**
     * 3 -> [| true |]              Equivalente a: [[] [true] []].
     */
    public void testLista3() {
        String value = "[| true |]";

        logger.log(Level.INFO, value);

        ArrayList listVacia1 = new ArrayList();

        ArrayList listTrue = new ArrayList();
        listTrue.add(true);

        ArrayList listVacia2 = new ArrayList();

        ArrayList listRes = new ArrayList();
        listRes.add(listVacia1);
        listRes.add(listTrue);
        listRes.add(listVacia2);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

    /**
     *  4 -> [|]                     Equivalente a: [[] []].
     */
    public void testLista4() {
        String value = "[|]";
        logger.log(Level.INFO, value);

        ArrayList listVacia1 = new ArrayList();
        ArrayList listVacia2 = new ArrayList();
        ArrayList listRes = new ArrayList();
        listRes.add(listVacia1);
        listRes.add(listVacia2);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

    /**
     * 5 -> [| [1 2] | 3]           Equivalente a: [[] [[1 2]] [3]].
     */
    public void testLista5() {
        String value = "[| [1 2] | 3]";
        logger.log(Level.INFO, value);

        ArrayList listVacia1 = new ArrayList();

        ArrayList list12 = new ArrayList();
        list12.add(1);
        list12.add(2);

        ArrayList list12inside = new ArrayList();
        list12inside.add(list12);

        ArrayList list3 = new ArrayList();
        list3.add(3);

        ArrayList listRes = new ArrayList();
        listRes.add(listVacia1);
        listRes.add(list12inside);
        listRes.add(list3);

        TestCase.assertEquals(value, listRes, Parse.parse(value));
    }

}
