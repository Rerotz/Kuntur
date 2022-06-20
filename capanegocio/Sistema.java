
package capanegocio;
import java.util.ArrayList;

public class Sistema {
    public ArrayList <Reservas> listador = new ArrayList();
    public ArrayList <Trabajador> empleado = new ArrayList();

    public String getInfoCliente() {
        return infoCliente;
    }

    public void setInfoCliente(String infoCliente) {
        this.infoCliente = infoCliente;
    }

    public String getInfoReserva() {
        return infoReserva;
    }

    public void setInfoReserva(String infoReserva) {
        this.infoReserva = infoReserva;
    }

    public String getInfoPago() {
        return infoPago;
    }

    public void setInfoPago(String infoPago) {
        this.infoPago = infoPago;
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }
    private String infoCliente;
    private String infoReserva;
    private String infoPago;
    private String idPedido;
    public String Organizar()
    {
       return "Metodo no implementado";
    } 
    
}
