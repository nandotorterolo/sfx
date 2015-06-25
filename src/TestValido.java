/**
 * Created by fernando on 24/06/15.
 *
 */
import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.Symbol;
import junit.framework.TestCase;

import java.io.CharArrayReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestValido extends TestCase {

    Logger logger = java.util.logging.Logger.getAnonymousLogger();
    String validos [] = new String[100];
    Reader reader;
    Scanner scanner = new Scanner(null);
    Parser parser = new Parser(scanner,new DefaultSymbolFactory());
    Symbol symbol;

    protected void setUp(){

        // constructores
        parser.rConstructors.put("Date", new Fecha(0,0,0));

        // Inicializo el verctor de pruebas en null
        for (int i = 0; i < validos.length; i++) { validos[i] = "null";}

        // Valores simples expresados con palabras reservadas:
        validos[0] = "true";                 // Valores booleanos.
        validos[1] = "false";
        validos[2] = "null";                 // Valor nulo o no definido.
        // Numerales enteros y de punto flotante, siguiendo las convenciones de Java:
        validos[3] = "1";                   // Enteros de 32 bits (int).
        validos[4] = "123";
        validos[5] = "-4";
        validos[6] = "+15";
        validos[7] = "10l";                     // Enteros de 64 bits (long).
        validos[8] ="-1234567879L";
        validos[9] ="1.1";                      // Punto flotante de precisión doble (double).
        validos[10] = "-1.23";
        validos[11] = "+1e23";
        validos[12] = "1d";
        validos[13] = "0.1D";
        validos[14] = "1f";                     // Punto flotante de precisión simple (float).
        validos[15] = "0.010F";
        validos[16] = "-1e-2f";
        validos[17] = "0xCAFE";                 // Enteros en notación hexadecimal (int y long). 51966 value
        validos[18] = "0xC4F3L";
        // Cadenas de texto entre comillas dobles, siguiendo las convenciones de Java:
        validos[19] = "\"\"";                  // Cadenas de texto (String).
        validos[20] = "\"abcde\"";
        validos[21] = "\"\n\\\u1234\"";                     // Ejemplos de cadenas con escapes.
        // Listas de valores entre paréntesis rectos (List):
        validos[22] = "[]";                                 // Listas simples.
        validos[23] = "[1 2 3]";
        validos[24] = "[true \"a\" 1.1f]";
        validos[25] = "[[1 2 3] [4 [5] 6] [\"hola\"]]";    // Listas anidadas.
        // Diccionarios definidos con pares clave:valor entre llaves (Map).
        validos[26] = "{}";
        validos[27] = "{1:\"1\" \"2\":2} ";                 // Las claves y valores pueden ser de cualquier tipo.
//fixme        validos[28] = "{\"a\": {\"b\":1 \"c\":[2]}}";       // Diccionarios anidados.
        // Llamadas a constructores previamente registrados (del tipo de corresponda).
        validos[29] = "Date(2015 5 17)";            // Construye una fecha (java.util.Date) para el año, mes y día dados.


        validos[99] = "\"Todos los casos de prueba se han parseado correctamente.!!!! :-)\"";
    }

    private Object parse(String val) {
        reader = new CharArrayReader(val.toCharArray());
        scanner.yyreset(reader);
        parser.setScanner(scanner);

        try {
            symbol = parser.parse();
            return symbol.value;
        } catch (Exception e) {
            e.printStackTrace();
            throw new IllegalStateException("parsing" + val , e);
        }
    }

    public void atestCases() {
        for (int i = 0; i < validos.length; i++) {

            try {
               // parse(i);
            }
            catch (Exception e) {
                System.out.println("Caught an exception. Parsing value: " + validos[i] );
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    System.out.println(stackTraceElement);
                }
            }
        }
    }

  public void testTrue() {
    String value = "true";
    logger.log(Level.INFO, value);
    assertEquals(value, true, parse(value)); }

  public void testFalse(){
    String value = "false";
    logger.log(Level.INFO, value);
    assertEquals(value, false, parse(value)); }

  public void testNull() {
    String value = "null";
    logger.log(Level.INFO, value);
    assertEquals(value, null, parse(value)); }

  public void testInt1() {
    String value = "1";
    logger.log(Level.INFO, value);
    assertEquals(value, new Integer(1), parse(value)); }

  public void testInt123() {
    String value = "123";
    logger.log(Level.INFO, value);
    assertEquals(value, new Integer(123), parse(value)); }

  public void testInt_4() {
    String value = "-4";
    logger.log(Level.INFO, value);
    assertEquals(value, new Integer(-4), parse(value)); }

  public void testIntMas15() {
    String value = "+15";
    logger.log(Level.INFO, value);
    assertEquals(value, new Integer(15), parse(value)); }

  public void testLong10L() {
    String value = "10l";
    logger.log(Level.INFO, value);
    assertEquals(value, new Long(10), parse(value)); }

  public void testLong_1234567879L() {
    String value = "-1234567879L";
    logger.log(Level.INFO, value);
    assertEquals(value, new Long(-1234567879), parse(value)); }

  public void testDouble11() {
    String value = "1.1";
    logger.log(Level.INFO, value);
    assertEquals(value, new Double(1.1), parse(value)); }

  public void testDouble1e_123() {
    String value = "-1.23";
    logger.log(Level.INFO, value);
    assertEquals(value, new Double(-1.23), parse(value)); }

  public void testDouble1eE123() {
    String value = "+1e23";
    logger.log(Level.INFO, value);
    assertEquals(value, new Double(1e23), parse(value)); }

  public void testDouble1d() {
    String value = "1d";
    logger.log(Level.INFO, value);
    assertEquals(value, new Double(1), parse(value)); }

  public void testDouble01D() {
    String value = "0.1D";
    logger.log(Level.INFO, value);
    assertEquals(value, new Double(0.1), parse(value)); }

  public void testFloat1f() {
    String value = "1f";
    logger.log(Level.INFO, value);
    assertEquals(value, new Float(1), parse(value)); }
  
  public void testFloat0010F() {
    String value = "0.010F";
    logger.log(Level.INFO, value);
    assertEquals(value, new Float(0.010), parse(value)); }

  public void testFloat_1e_2f() {
    String value = "-1e-2f";
    logger.log(Level.INFO, value);
    assertEquals(value, new Float(-1e-2), parse(value)); }

  public void testHexInt() {
    String value = "0xCAFE";
    logger.log(Level.INFO, value);
    assertEquals(value, new Integer(51966), parse(value));
  }

  public void testHexLong() {
    String value = "0xC4F3L";
    logger.log(Level.INFO, value);
    assertEquals(value, new Long(50419), parse(value));
  }

  public void testCadenaTexto() {
    String value = "\"\"";
    logger.log(Level.INFO, value);
    assertEquals(value, "\"\"", parse(value));
  }

  public void testCadenaTexto2() {
    String value = "\"abcde\"";
    logger.log(Level.INFO, value);
    assertEquals(value, "\"abcde\"", parse(value));
  }

  public void testCadenaTexto3() {
    String value = "\"\n\\\u1234\"";
    logger.log(Level.INFO, value);
    assertEquals(value, "\"\n\\ሴ\"", parse(value));
  }

  public void testLista1() {
    String value = "[]";
    logger.log(Level.INFO, value);
    assertEquals(value, new ArrayList(), parse(value));
  }

  public void testLista2() {
    String value = "[1 2 3]";
    logger.log(Level.INFO, value);
    ArrayList list = new ArrayList();
    list.add(1);
    list.add(2);
    list.add(3);
    assertEquals(value, list , parse(value));
  }

  public void testLista3() {
    String value = "[true \"a\" 1.1f]";
    logger.log(Level.INFO, value);
    ArrayList list = new ArrayList();
    list.add(true);
    list.add("\"a\"");
    list.add(1.1f);
    assertEquals(value, list , parse(value));
  }

  public void testLista4() {
    String value =  "[[1 2 3] [4 [5] 6] [\"hola\"]]";
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

    assertEquals(value, list5 , parse(value));
  }

  public void testMap() {
    String value = "{}";
    logger.log(Level.INFO, value);
    HashMap map =  new HashMap<String,String>();
    assertEquals(value, map , parse(value));
  }

  public void testMap2() {
    String value = "{1:\"1\" \"2\":2} ";
    logger.log(Level.INFO, value);
    HashMap map =  new HashMap<String,String>();
    map.put(1, "\"1\"");
    map.put("\"2\"", 2);
    assertEquals(value, map, parse(value));
  }

  public void testFecha() {  // fixme
    String value = "Date(2015 5 17)";
    logger.log(Level.INFO, value);
    Date fecha =  new Date(2015 - 1900,5,17);
    assertEquals(value, fecha, parse(value));
  }

  public void testListaAnidada() {
    String value = "[1[2]]";
    logger.log(Level.INFO, value);
    ArrayList list = new ArrayList();
    list.add(2);
    ArrayList list2 = new ArrayList();
    list2.add(1);
    list2.add(list);

    assertEquals(value, list2, parse(value));
  }
/*
//fixme        validos[28] = "{\"a\": {\"b\":1 \"c\":[2]}}";       // Diccionarios anidados.
*/


}
