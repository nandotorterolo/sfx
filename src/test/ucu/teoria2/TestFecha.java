package ucu.teoria2;

import junit.framework.TestCase;
import ucu.Fecha;
import ucu.FechaFactory;
import ucu.Parse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by fernando on 25/06/15.
 * Construye una fecha (java.util.Date) para el año, mes y día dados.
 * Debe registrarse antes de correr el test, cual es la Fabrica asociada a la main.Fecha a Crear!
 */
public class TestFecha extends TestCase {

    Logger logger;

    protected void setUp() {
        logger = Logger.getAnonymousLogger();
        Parse.registrar("Date", new FechaFactory());
    }

    public void testFecha() {
        String value = "Date(2015 5 17)";
        logger.log(Level.WARNING, value);
        Date fecha = new Date(2015 - 1900, 5, 17);
        SimpleDateFormat dateFormat =new SimpleDateFormat("dd/MM/yyyy");
        assertEquals(value, dateFormat.format(fecha), Parse.parse(value).toString());
    }

    public void testFecha2() {
        String value = "Date(2015 5 17)";
        logger.log(Level.WARNING, value);
        Fecha fecha = new Fecha(2015, 5, 17);
        TestCase.assertEquals(value, fecha.toString(), Parse.parse(value).toString());
    }
}
