
package capanegocio;
import java.util.ArrayList;

public class Pago {
    public ArrayList <Cliente> remunerador = new ArrayList();
    public ArrayList <Reservas> organizador = new ArrayList();

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public String getMontoPago() {
        return montoPago;
    }

    public void setMontoPago(String montoPago) {
        this.montoPago = montoPago;
    }
    private String metodoPago;
    private String montoPago;
    public String Comprobar()
    {
        return "Metodo no implementado";
    }
    
}
