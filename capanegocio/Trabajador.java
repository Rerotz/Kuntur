
package capanegocio;


public class Trabajador extends Persona {
    public Sistema organizador;

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String horarioTrabajo;
    private String id; 
    public String Atender()
    {
        return " Metodo no implementado";
    }
    
}
