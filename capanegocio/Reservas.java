
package capanegocio;


public class Reservas {
    public Pago precio;
    public Sistema organizador;

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
    private String codigoCliente;
    private String fechaReserva;
    private String codigoReserva;
    public String Listar()
    {
       return "Metodo no implementado";
    }
    
}
