/**
 * Created by fernando on 24/06/15.
 *
 */
import java_cup.runtime.DefaultSymbolFactory;
import java_cup.runtime.Symbol;
import junit.framework.TestCase;

import java.io.CharArrayReader;
import java.io.Reader;

public class TestValido extends TestCase {

    String validos [] = new String[100];
    Reader reader;
    Parser parser;
    Scanner scanner = new Scanner(null);
    Symbol symbol;

    protected void setUp(){

        // Inicializo todo el verctor de pruebas en null
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

    private void parse(String input) {
        reader = new CharArrayReader(input.toCharArray());
        scanner.yyreset(reader);
        parser = new Parser(scanner, new DefaultSymbolFactory());

        try {
            // Registro de constructores
            parser.rConstructors.put("Date", new Fecha(0,0,0));

            symbol = parser.parse();
            System.out.println(symbol.value);

        } catch (Exception e) {
            parser.rConstructors.get("Fecha");
            e.printStackTrace();
            throw new IllegalStateException("parsing"+ input , e);
        }
    }

    public void testCases() {
        for (String s:validos) {
            try {
            parse(s);
            }
            catch (Exception e) {
                System.out.println("Caught an exception. Parsing value: " + s );
                for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                    System.out.println(stackTraceElement);
                }
            }
        }
    }
}
