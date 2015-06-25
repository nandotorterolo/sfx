import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by fernando on 24/06/15.
 */
public class Fecha implements Constructor {

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public Date fecha = new Date(0L);
    public Fecha(Integer año, Integer mes, Integer dia) {
        fecha = new Date(año -1900, mes, dia);
    }

    @Override
    public String toString() {
        return dateFormat.format(fecha);
    }

    @Override
    public Constructor Build(ArrayList<Object> Parameters) {
        return new Fecha((Integer)Parameters.get(0) , (Integer)Parameters.get(1) , (Integer)Parameters.get(2));
    }
}
