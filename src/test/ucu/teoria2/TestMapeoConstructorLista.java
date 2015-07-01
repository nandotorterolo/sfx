package ucu.teoria2;

import junit.framework.TestCase;
import ucu.FechaFactory;
import ucu.Parse;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 * Class1[1 2 | 3 4 | 5 6]   EQUIVALENTE -> [Class1(1 2) Class1(3 4) Class1(5 6)]
 */
public class TestMapeoConstructorLista extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
        Parse.registrar("Date", new FechaFactory());
    }

    /**
     * Class1[1 2 | 3 4 | 5 6]   EQUIVALENTE -> [Class1(1 2) Class1(3 4) Class1(5 6)]
     * Date[2015 5 17 | 2015 5 18 | 2015 5 19] EQUIVALENTE -> [Date(2015 5 18) Date(2015 5 18) Date(2015 5 19)]
     */
    public void testConstructor1() {

        String value = "Date[2015 5 17 | 2015 5 18 | 2015 5 19]";
        logger.log(Level.INFO, value);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha1 = new Date(2015 - 1900, 5, 17);
        Date fecha2 = new Date(2015 - 1900, 5, 18);
        Date fecha3 = new Date(2015 - 1900, 5, 19);

        ArrayList listRes = new ArrayList();
        listRes.add(dateFormat.format(fecha1));
        listRes.add(dateFormat.format(fecha2));
        listRes.add(dateFormat.format(fecha3));

        Object result = Parse.parse(value);
        assertEquals(value, dateFormat.format(fecha1), ((ArrayList) result).get(0).toString());
        assertEquals(value, dateFormat.format(fecha2), ((ArrayList) result).get(1).toString());
        assertEquals(value, dateFormat.format(fecha3), ((ArrayList) result).get(2).toString());

    }

    /**
     * Class1[[1 2] [3 4] [5 6]]                 EQUIVALENTE -> [Class1(1 2) Class1(3 4) Class1(5 6)]
     * Date[[2015 5 17] [2015 5 18] [2015 5 19]] EQUIVALENTE -> [Date(2015 5 18) Date(2015 5 18) Date(2015 5 19)]
     */
    public void testConstructor2() {

        String value = "Date[[2015 5 17] [2015 5 18] [2015 5 19]]";
        logger.log(Level.INFO, value);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha1 = new Date(2015 - 1900, 5, 17);
        Date fecha2 = new Date(2015 - 1900, 5, 18);
        Date fecha3 = new Date(2015 - 1900, 5, 19);

        ArrayList listRes = new ArrayList();
        listRes.add(dateFormat.format(fecha1));
        listRes.add(dateFormat.format(fecha2));
        listRes.add(dateFormat.format(fecha3));

        Object result = Parse.parse(value);
        assertEquals(value, dateFormat.format(fecha1), ((ArrayList) result).get(0).toString());
        assertEquals(value, dateFormat.format(fecha2), ((ArrayList) result).get(1).toString());
        assertEquals(value, dateFormat.format(fecha3), ((ArrayList) result).get(2).toString());

    }

    /**
     *  Class2("a"...)[7 0 | 1.1]                 EQUIVALENTE -> [[Class2("a" 7 0) Class2("a" 1.1)]
     *  Date(2015...)[5 17|5 18]                 EQUIVALENTE -> [Date(2015 5 17) Date(2015 5 18)]
     */
    public void testConstructor3() {  // fixme

        String value = "Date(2015...)[5 17|5 18]";
        logger.log(Level.INFO, value);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date fecha1 = new Date(2015 - 1900, 5, 17);
        Date fecha2 = new Date(2015 - 1900, 5, 18);

        ArrayList listRes = new ArrayList();
        listRes.add(dateFormat.format(fecha1));
        listRes.add(dateFormat.format(fecha2));

        Object result = Parse.parse(value);
        assertEquals(value, dateFormat.format(fecha1), ((ArrayList) result).get(0).toString());
        assertEquals(value, dateFormat.format(fecha2), ((ArrayList) result).get(1).toString());

    }

}
