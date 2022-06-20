
package capanegocio;
import java.util.ArrayList;


public class Cliente extends Persona {
    public Pago remuneracion;
    
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    private String correo;
    private String ruc;
    private String codigo;

    public String Comprar()
    {
       return "Metodo no implementado";
    }
    
}
